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

@Tag("46")
class Record_4042 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4042: FirstName is Rosalee")
	void FirstNameOfRecord4042() {
		assertEquals("Rosalee", customers.get(4041).getFirstName());
	}

	@Test
	@DisplayName("Record 4042: LastName is Veney")
	void LastNameOfRecord4042() {
		assertEquals("Veney", customers.get(4041).getLastName());
	}

	@Test
	@DisplayName("Record 4042: Company is Graphic Impact Signs Inc")
	void CompanyOfRecord4042() {
		assertEquals("Graphic Impact Signs Inc", customers.get(4041).getCompany());
	}

	@Test
	@DisplayName("Record 4042: Address is 242 Noble Rd")
	void AddressOfRecord4042() {
		assertEquals("242 Noble Rd", customers.get(4041).getAddress());
	}

	@Test
	@DisplayName("Record 4042: City is Clarks Summit")
	void CityOfRecord4042() {
		assertEquals("Clarks Summit", customers.get(4041).getCity());
	}

	@Test
	@DisplayName("Record 4042: County is Lackawanna")
	void CountyOfRecord4042() {
		assertEquals("Lackawanna", customers.get(4041).getCounty());
	}

	@Test
	@DisplayName("Record 4042: State is PA")
	void StateOfRecord4042() {
		assertEquals("PA", customers.get(4041).getState());
	}

	@Test
	@DisplayName("Record 4042: ZIP is 18411")
	void ZIPOfRecord4042() {
		assertEquals("18411", customers.get(4041).getZIP());
	}

	@Test
	@DisplayName("Record 4042: Phone is 570-586-3889")
	void PhoneOfRecord4042() {
		assertEquals("570-586-3889", customers.get(4041).getPhone());
	}

	@Test
	@DisplayName("Record 4042: Fax is 570-586-5984")
	void FaxOfRecord4042() {
		assertEquals("570-586-5984", customers.get(4041).getFax());
	}

	@Test
	@DisplayName("Record 4042: Email is rosalee@veney.com")
	void EmailOfRecord4042() {
		assertEquals("rosalee@veney.com", customers.get(4041).getEmail());
	}

	@Test
	@DisplayName("Record 4042: Web is http://www.rosaleeveney.com")
	void WebOfRecord4042() {
		assertEquals("http://www.rosaleeveney.com", customers.get(4041).getWeb());
	}
}
