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

@Tag("17")
class Record_4600 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4600: FirstName is Maricela")
	void FirstNameOfRecord4600() {
		assertEquals("Maricela", customers.get(4599).getFirstName());
	}

	@Test
	@DisplayName("Record 4600: LastName is Dayao")
	void LastNameOfRecord4600() {
		assertEquals("Dayao", customers.get(4599).getLastName());
	}

	@Test
	@DisplayName("Record 4600: Company is Mail Boxes Etc")
	void CompanyOfRecord4600() {
		assertEquals("Mail Boxes Etc", customers.get(4599).getCompany());
	}

	@Test
	@DisplayName("Record 4600: Address is 5151 E Memorial Dr")
	void AddressOfRecord4600() {
		assertEquals("5151 E Memorial Dr", customers.get(4599).getAddress());
	}

	@Test
	@DisplayName("Record 4600: City is Muncie")
	void CityOfRecord4600() {
		assertEquals("Muncie", customers.get(4599).getCity());
	}

	@Test
	@DisplayName("Record 4600: County is Delaware")
	void CountyOfRecord4600() {
		assertEquals("Delaware", customers.get(4599).getCounty());
	}

	@Test
	@DisplayName("Record 4600: State is IN")
	void StateOfRecord4600() {
		assertEquals("IN", customers.get(4599).getState());
	}

	@Test
	@DisplayName("Record 4600: ZIP is 47302")
	void ZIPOfRecord4600() {
		assertEquals("47302", customers.get(4599).getZIP());
	}

	@Test
	@DisplayName("Record 4600: Phone is 765-289-1283")
	void PhoneOfRecord4600() {
		assertEquals("765-289-1283", customers.get(4599).getPhone());
	}

	@Test
	@DisplayName("Record 4600: Fax is 765-289-9822")
	void FaxOfRecord4600() {
		assertEquals("765-289-9822", customers.get(4599).getFax());
	}

	@Test
	@DisplayName("Record 4600: Email is maricela@dayao.com")
	void EmailOfRecord4600() {
		assertEquals("maricela@dayao.com", customers.get(4599).getEmail());
	}

	@Test
	@DisplayName("Record 4600: Web is http://www.mariceladayao.com")
	void WebOfRecord4600() {
		assertEquals("http://www.mariceladayao.com", customers.get(4599).getWeb());
	}
}
