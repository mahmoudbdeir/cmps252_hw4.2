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

@Tag("3")
class Record_1953 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1953: FirstName is Van")
	void FirstNameOfRecord1953() {
		assertEquals("Van", customers.get(1952).getFirstName());
	}

	@Test
	@DisplayName("Record 1953: LastName is Jarell")
	void LastNameOfRecord1953() {
		assertEquals("Jarell", customers.get(1952).getLastName());
	}

	@Test
	@DisplayName("Record 1953: Company is Bodle, David J Esq")
	void CompanyOfRecord1953() {
		assertEquals("Bodle, David J Esq", customers.get(1952).getCompany());
	}

	@Test
	@DisplayName("Record 1953: Address is 299 Us Highway 22  #-r")
	void AddressOfRecord1953() {
		assertEquals("299 Us Highway 22  #-r", customers.get(1952).getAddress());
	}

	@Test
	@DisplayName("Record 1953: City is Dunellen")
	void CityOfRecord1953() {
		assertEquals("Dunellen", customers.get(1952).getCity());
	}

	@Test
	@DisplayName("Record 1953: County is Middlesex")
	void CountyOfRecord1953() {
		assertEquals("Middlesex", customers.get(1952).getCounty());
	}

	@Test
	@DisplayName("Record 1953: State is NJ")
	void StateOfRecord1953() {
		assertEquals("NJ", customers.get(1952).getState());
	}

	@Test
	@DisplayName("Record 1953: ZIP is 8812")
	void ZIPOfRecord1953() {
		assertEquals("8812", customers.get(1952).getZIP());
	}

	@Test
	@DisplayName("Record 1953: Phone is 732-752-0047")
	void PhoneOfRecord1953() {
		assertEquals("732-752-0047", customers.get(1952).getPhone());
	}

	@Test
	@DisplayName("Record 1953: Fax is 732-752-8296")
	void FaxOfRecord1953() {
		assertEquals("732-752-8296", customers.get(1952).getFax());
	}

	@Test
	@DisplayName("Record 1953: Email is van@jarell.com")
	void EmailOfRecord1953() {
		assertEquals("van@jarell.com", customers.get(1952).getEmail());
	}

	@Test
	@DisplayName("Record 1953: Web is http://www.vanjarell.com")
	void WebOfRecord1953() {
		assertEquals("http://www.vanjarell.com", customers.get(1952).getWeb());
	}
}
