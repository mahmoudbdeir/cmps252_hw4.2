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

@Tag("24")
class Record_1873 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1873: FirstName is Rosalee")
	void FirstNameOfRecord1873() {
		assertEquals("Rosalee", customers.get(1872).getFirstName());
	}

	@Test
	@DisplayName("Record 1873: LastName is Burts")
	void LastNameOfRecord1873() {
		assertEquals("Burts", customers.get(1872).getLastName());
	}

	@Test
	@DisplayName("Record 1873: Company is Farmers Electric Cooprtv Inc")
	void CompanyOfRecord1873() {
		assertEquals("Farmers Electric Cooprtv Inc", customers.get(1872).getCompany());
	}

	@Test
	@DisplayName("Record 1873: Address is Hunts Point Term Mkt")
	void AddressOfRecord1873() {
		assertEquals("Hunts Point Term Mkt", customers.get(1872).getAddress());
	}

	@Test
	@DisplayName("Record 1873: City is Bronx")
	void CityOfRecord1873() {
		assertEquals("Bronx", customers.get(1872).getCity());
	}

	@Test
	@DisplayName("Record 1873: County is Bronx")
	void CountyOfRecord1873() {
		assertEquals("Bronx", customers.get(1872).getCountry());
	}

	@Test
	@DisplayName("Record 1873: State is NY")
	void StateOfRecord1873() {
		assertEquals("NY", customers.get(1872).getState());
	}

	@Test
	@DisplayName("Record 1873: ZIP is 10474")
	void ZIPOfRecord1873() {
		assertEquals("10474", customers.get(1872).getZIP());
	}

	@Test
	@DisplayName("Record 1873: Phone is 718-378-9663")
	void PhoneOfRecord1873() {
		assertEquals("718-378-9663", customers.get(1872).getPhone());
	}

	@Test
	@DisplayName("Record 1873: Fax is 718-378-1092")
	void FaxOfRecord1873() {
		assertEquals("718-378-1092", customers.get(1872).getFax());
	}

	@Test
	@DisplayName("Record 1873: Email is rosalee@burts.com")
	void EmailOfRecord1873() {
		assertEquals("rosalee@burts.com", customers.get(1872).getEmail());
	}

	@Test
	@DisplayName("Record 1873: Web is http://www.rosaleeburts.com")
	void WebOfRecord1873() {
		assertEquals("http://www.rosaleeburts.com", customers.get(1872).getWeb());
	}
}
