package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("8")
class Record_4259 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4259: FirstName is Chong")
	void FirstNameOfRecord4259() {
		assertEquals("Chong", customers.get(4258).getFirstName());
	}

	@Test
	@DisplayName("Record 4259: LastName is Amell")
	void LastNameOfRecord4259() {
		assertEquals("Amell", customers.get(4258).getLastName());
	}

	@Test
	@DisplayName("Record 4259: Company is La Quinta Inn Ntnwd Reserv Svc")
	void CompanyOfRecord4259() {
		assertEquals("La Quinta Inn Ntnwd Reserv Svc", customers.get(4258).getCompany());
	}

	@Test
	@DisplayName("Record 4259: Address is 2857 Nazareth Rd")
	void AddressOfRecord4259() {
		assertEquals("2857 Nazareth Rd", customers.get(4258).getAddress());
	}

	@Test
	@DisplayName("Record 4259: City is Easton")
	void CityOfRecord4259() {
		assertEquals("Easton", customers.get(4258).getCity());
	}

	@Test
	@DisplayName("Record 4259: County is Northampton")
	void CountyOfRecord4259() {
		assertEquals("Northampton", customers.get(4258).getCounty());
	}

	@Test
	@DisplayName("Record 4259: State is PA")
	void StateOfRecord4259() {
		assertEquals("PA", customers.get(4258).getState());
	}

	@Test
	@DisplayName("Record 4259: ZIP is 18045")
	void ZIPOfRecord4259() {
		assertEquals("18045", customers.get(4258).getZIP());
	}

	@Test
	@DisplayName("Record 4259: Phone is 610-258-2562")
	void PhoneOfRecord4259() {
		assertEquals("610-258-2562", customers.get(4258).getPhone());
	}

	@Test
	@DisplayName("Record 4259: Fax is 610-258-8735")
	void FaxOfRecord4259() {
		assertEquals("610-258-8735", customers.get(4258).getFax());
	}

	@Test
	@DisplayName("Record 4259: Email is chong@amell.com")
	void EmailOfRecord4259() {
		assertEquals("chong@amell.com", customers.get(4258).getEmail());
	}

	@Test
	@DisplayName("Record 4259: Web is http://www.chongamell.com")
	void WebOfRecord4259() {
		assertEquals("http://www.chongamell.com", customers.get(4258).getWeb());
	}
}
