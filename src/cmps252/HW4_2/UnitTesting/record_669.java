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

@Tag("38")
class Record_669 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 669: FirstName is Leonard")
	void FirstNameOfRecord669() {
		assertEquals("Leonard", customers.get(668).getFirstName());
	}

	@Test
	@DisplayName("Record 669: LastName is Maciejewski")
	void LastNameOfRecord669() {
		assertEquals("Maciejewski", customers.get(668).getLastName());
	}

	@Test
	@DisplayName("Record 669: Company is Wayne K Lemieux Pro Corp")
	void CompanyOfRecord669() {
		assertEquals("Wayne K Lemieux Pro Corp", customers.get(668).getCompany());
	}

	@Test
	@DisplayName("Record 669: Address is 6510 E 64th Ave")
	void AddressOfRecord669() {
		assertEquals("6510 E 64th Ave", customers.get(668).getAddress());
	}

	@Test
	@DisplayName("Record 669: City is Commerce City")
	void CityOfRecord669() {
		assertEquals("Commerce City", customers.get(668).getCity());
	}

	@Test
	@DisplayName("Record 669: County is Adams")
	void CountyOfRecord669() {
		assertEquals("Adams", customers.get(668).getCounty());
	}

	@Test
	@DisplayName("Record 669: State is CO")
	void StateOfRecord669() {
		assertEquals("CO", customers.get(668).getState());
	}

	@Test
	@DisplayName("Record 669: ZIP is 80022")
	void ZIPOfRecord669() {
		assertEquals("80022", customers.get(668).getZIP());
	}

	@Test
	@DisplayName("Record 669: Phone is 303-289-5294")
	void PhoneOfRecord669() {
		assertEquals("303-289-5294", customers.get(668).getPhone());
	}

	@Test
	@DisplayName("Record 669: Fax is 303-289-2866")
	void FaxOfRecord669() {
		assertEquals("303-289-2866", customers.get(668).getFax());
	}

	@Test
	@DisplayName("Record 669: Email is leonard@maciejewski.com")
	void EmailOfRecord669() {
		assertEquals("leonard@maciejewski.com", customers.get(668).getEmail());
	}

	@Test
	@DisplayName("Record 669: Web is http://www.leonardmaciejewski.com")
	void WebOfRecord669() {
		assertEquals("http://www.leonardmaciejewski.com", customers.get(668).getWeb());
	}
}
