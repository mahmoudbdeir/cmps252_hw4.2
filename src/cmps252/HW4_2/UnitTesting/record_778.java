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

@Tag("26")
class Record_778 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 778: FirstName is Darla")
	void FirstNameOfRecord778() {
		assertEquals("Darla", customers.get(777).getFirstName());
	}

	@Test
	@DisplayName("Record 778: LastName is Foulger")
	void LastNameOfRecord778() {
		assertEquals("Foulger", customers.get(777).getLastName());
	}

	@Test
	@DisplayName("Record 778: Company is Springfield Acura")
	void CompanyOfRecord778() {
		assertEquals("Springfield Acura", customers.get(777).getCompany());
	}

	@Test
	@DisplayName("Record 778: Address is 2122 Mcdonald Ave")
	void AddressOfRecord778() {
		assertEquals("2122 Mcdonald Ave", customers.get(777).getAddress());
	}

	@Test
	@DisplayName("Record 778: City is Brooklyn")
	void CityOfRecord778() {
		assertEquals("Brooklyn", customers.get(777).getCity());
	}

	@Test
	@DisplayName("Record 778: County is Kings")
	void CountyOfRecord778() {
		assertEquals("Kings", customers.get(777).getCounty());
	}

	@Test
	@DisplayName("Record 778: State is NY")
	void StateOfRecord778() {
		assertEquals("NY", customers.get(777).getState());
	}

	@Test
	@DisplayName("Record 778: ZIP is 11223")
	void ZIPOfRecord778() {
		assertEquals("11223", customers.get(777).getZIP());
	}

	@Test
	@DisplayName("Record 778: Phone is 718-627-5558")
	void PhoneOfRecord778() {
		assertEquals("718-627-5558", customers.get(777).getPhone());
	}

	@Test
	@DisplayName("Record 778: Fax is 718-627-8345")
	void FaxOfRecord778() {
		assertEquals("718-627-8345", customers.get(777).getFax());
	}

	@Test
	@DisplayName("Record 778: Email is darla@foulger.com")
	void EmailOfRecord778() {
		assertEquals("darla@foulger.com", customers.get(777).getEmail());
	}

	@Test
	@DisplayName("Record 778: Web is http://www.darlafoulger.com")
	void WebOfRecord778() {
		assertEquals("http://www.darlafoulger.com", customers.get(777).getWeb());
	}
}
