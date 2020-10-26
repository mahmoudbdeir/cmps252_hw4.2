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
class Record_1921 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1921: FirstName is Lemuel")
	void FirstNameOfRecord1921() {
		assertEquals("Lemuel", customers.get(1920).getFirstName());
	}

	@Test
	@DisplayName("Record 1921: LastName is Laprarie")
	void LastNameOfRecord1921() {
		assertEquals("Laprarie", customers.get(1920).getLastName());
	}

	@Test
	@DisplayName("Record 1921: Company is Disabled Amer Veterans")
	void CompanyOfRecord1921() {
		assertEquals("Disabled Amer Veterans", customers.get(1920).getCompany());
	}

	@Test
	@DisplayName("Record 1921: Address is Johnson Ave")
	void AddressOfRecord1921() {
		assertEquals("Johnson Ave", customers.get(1920).getAddress());
	}

	@Test
	@DisplayName("Record 1921: City is Lincoln")
	void CityOfRecord1921() {
		assertEquals("Lincoln", customers.get(1920).getCity());
	}

	@Test
	@DisplayName("Record 1921: County is Sussex")
	void CountyOfRecord1921() {
		assertEquals("Sussex", customers.get(1920).getCounty());
	}

	@Test
	@DisplayName("Record 1921: State is DE")
	void StateOfRecord1921() {
		assertEquals("DE", customers.get(1920).getState());
	}

	@Test
	@DisplayName("Record 1921: ZIP is 19960")
	void ZIPOfRecord1921() {
		assertEquals("19960", customers.get(1920).getZIP());
	}

	@Test
	@DisplayName("Record 1921: Phone is 302-422-0201")
	void PhoneOfRecord1921() {
		assertEquals("302-422-0201", customers.get(1920).getPhone());
	}

	@Test
	@DisplayName("Record 1921: Fax is 302-422-1454")
	void FaxOfRecord1921() {
		assertEquals("302-422-1454", customers.get(1920).getFax());
	}

	@Test
	@DisplayName("Record 1921: Email is lemuel@laprarie.com")
	void EmailOfRecord1921() {
		assertEquals("lemuel@laprarie.com", customers.get(1920).getEmail());
	}

	@Test
	@DisplayName("Record 1921: Web is http://www.lemuellaprarie.com")
	void WebOfRecord1921() {
		assertEquals("http://www.lemuellaprarie.com", customers.get(1920).getWeb());
	}
}
