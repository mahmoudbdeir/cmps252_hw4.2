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

@Tag("41")
class Record_4981 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4981: FirstName is Shon")
	void FirstNameOfRecord4981() {
		assertEquals("Shon", customers.get(4980).getFirstName());
	}

	@Test
	@DisplayName("Record 4981: LastName is Halseth")
	void LastNameOfRecord4981() {
		assertEquals("Halseth", customers.get(4980).getLastName());
	}

	@Test
	@DisplayName("Record 4981: Company is Days Inn Cary")
	void CompanyOfRecord4981() {
		assertEquals("Days Inn Cary", customers.get(4980).getCompany());
	}

	@Test
	@DisplayName("Record 4981: Address is 7300 Metro Blvd")
	void AddressOfRecord4981() {
		assertEquals("7300 Metro Blvd", customers.get(4980).getAddress());
	}

	@Test
	@DisplayName("Record 4981: City is Minneapolis")
	void CityOfRecord4981() {
		assertEquals("Minneapolis", customers.get(4980).getCity());
	}

	@Test
	@DisplayName("Record 4981: County is Hennepin")
	void CountyOfRecord4981() {
		assertEquals("Hennepin", customers.get(4980).getCounty());
	}

	@Test
	@DisplayName("Record 4981: State is MN")
	void StateOfRecord4981() {
		assertEquals("MN", customers.get(4980).getState());
	}

	@Test
	@DisplayName("Record 4981: ZIP is 55439")
	void ZIPOfRecord4981() {
		assertEquals("55439", customers.get(4980).getZIP());
	}

	@Test
	@DisplayName("Record 4981: Phone is 952-835-8940")
	void PhoneOfRecord4981() {
		assertEquals("952-835-8940", customers.get(4980).getPhone());
	}

	@Test
	@DisplayName("Record 4981: Fax is 952-835-5245")
	void FaxOfRecord4981() {
		assertEquals("952-835-5245", customers.get(4980).getFax());
	}

	@Test
	@DisplayName("Record 4981: Email is shon@halseth.com")
	void EmailOfRecord4981() {
		assertEquals("shon@halseth.com", customers.get(4980).getEmail());
	}

	@Test
	@DisplayName("Record 4981: Web is http://www.shonhalseth.com")
	void WebOfRecord4981() {
		assertEquals("http://www.shonhalseth.com", customers.get(4980).getWeb());
	}
}
