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

@Tag("25")
class Record_4329 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4329: FirstName is Lyle")
	void FirstNameOfRecord4329() {
		assertEquals("Lyle", customers.get(4328).getFirstName());
	}

	@Test
	@DisplayName("Record 4329: LastName is Castilo")
	void LastNameOfRecord4329() {
		assertEquals("Castilo", customers.get(4328).getLastName());
	}

	@Test
	@DisplayName("Record 4329: Company is Spark Wire Products Co Inc")
	void CompanyOfRecord4329() {
		assertEquals("Spark Wire Products Co Inc", customers.get(4328).getCompany());
	}

	@Test
	@DisplayName("Record 4329: Address is 1225 Connecticut Ave Nw")
	void AddressOfRecord4329() {
		assertEquals("1225 Connecticut Ave Nw", customers.get(4328).getAddress());
	}

	@Test
	@DisplayName("Record 4329: City is Washington")
	void CityOfRecord4329() {
		assertEquals("Washington", customers.get(4328).getCity());
	}

	@Test
	@DisplayName("Record 4329: County is District of Columbia")
	void CountyOfRecord4329() {
		assertEquals("District of Columbia", customers.get(4328).getCounty());
	}

	@Test
	@DisplayName("Record 4329: State is DC")
	void StateOfRecord4329() {
		assertEquals("DC", customers.get(4328).getState());
	}

	@Test
	@DisplayName("Record 4329: ZIP is 20036")
	void ZIPOfRecord4329() {
		assertEquals("20036", customers.get(4328).getZIP());
	}

	@Test
	@DisplayName("Record 4329: Phone is 202-659-7482")
	void PhoneOfRecord4329() {
		assertEquals("202-659-7482", customers.get(4328).getPhone());
	}

	@Test
	@DisplayName("Record 4329: Fax is 202-659-5869")
	void FaxOfRecord4329() {
		assertEquals("202-659-5869", customers.get(4328).getFax());
	}

	@Test
	@DisplayName("Record 4329: Email is lyle@castilo.com")
	void EmailOfRecord4329() {
		assertEquals("lyle@castilo.com", customers.get(4328).getEmail());
	}

	@Test
	@DisplayName("Record 4329: Web is http://www.lylecastilo.com")
	void WebOfRecord4329() {
		assertEquals("http://www.lylecastilo.com", customers.get(4328).getWeb());
	}
}
