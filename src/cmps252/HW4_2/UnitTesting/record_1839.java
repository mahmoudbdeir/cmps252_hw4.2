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

@Tag("48")
class Record_1839 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1839: FirstName is Delbert")
	void FirstNameOfRecord1839() {
		assertEquals("Delbert", customers.get(1838).getFirstName());
	}

	@Test
	@DisplayName("Record 1839: LastName is Pickar")
	void LastNameOfRecord1839() {
		assertEquals("Pickar", customers.get(1838).getLastName());
	}

	@Test
	@DisplayName("Record 1839: Company is Express Signs Usa")
	void CompanyOfRecord1839() {
		assertEquals("Express Signs Usa", customers.get(1838).getCompany());
	}

	@Test
	@DisplayName("Record 1839: Address is 960 N Main Ave")
	void AddressOfRecord1839() {
		assertEquals("960 N Main Ave", customers.get(1838).getAddress());
	}

	@Test
	@DisplayName("Record 1839: City is Scranton")
	void CityOfRecord1839() {
		assertEquals("Scranton", customers.get(1838).getCity());
	}

	@Test
	@DisplayName("Record 1839: County is Lackawanna")
	void CountyOfRecord1839() {
		assertEquals("Lackawanna", customers.get(1838).getCounty());
	}

	@Test
	@DisplayName("Record 1839: State is PA")
	void StateOfRecord1839() {
		assertEquals("PA", customers.get(1838).getState());
	}

	@Test
	@DisplayName("Record 1839: ZIP is 18508")
	void ZIPOfRecord1839() {
		assertEquals("18508", customers.get(1838).getZIP());
	}

	@Test
	@DisplayName("Record 1839: Phone is 570-489-7508")
	void PhoneOfRecord1839() {
		assertEquals("570-489-7508", customers.get(1838).getPhone());
	}

	@Test
	@DisplayName("Record 1839: Fax is 570-489-1563")
	void FaxOfRecord1839() {
		assertEquals("570-489-1563", customers.get(1838).getFax());
	}

	@Test
	@DisplayName("Record 1839: Email is delbert@pickar.com")
	void EmailOfRecord1839() {
		assertEquals("delbert@pickar.com", customers.get(1838).getEmail());
	}

	@Test
	@DisplayName("Record 1839: Web is http://www.delbertpickar.com")
	void WebOfRecord1839() {
		assertEquals("http://www.delbertpickar.com", customers.get(1838).getWeb());
	}
}
