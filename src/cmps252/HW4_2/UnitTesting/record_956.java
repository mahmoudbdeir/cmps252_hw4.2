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

@Tag("37")
class Record_956 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 956: FirstName is Cristopher")
	void FirstNameOfRecord956() {
		assertEquals("Cristopher", customers.get(955).getFirstName());
	}

	@Test
	@DisplayName("Record 956: LastName is Lazar")
	void LastNameOfRecord956() {
		assertEquals("Lazar", customers.get(955).getLastName());
	}

	@Test
	@DisplayName("Record 956: Company is Oyama Cabinet Inc")
	void CompanyOfRecord956() {
		assertEquals("Oyama Cabinet Inc", customers.get(955).getCompany());
	}

	@Test
	@DisplayName("Record 956: Address is 8200 E Pacific Pl  #-210")
	void AddressOfRecord956() {
		assertEquals("8200 E Pacific Pl  #-210", customers.get(955).getAddress());
	}

	@Test
	@DisplayName("Record 956: City is Denver")
	void CityOfRecord956() {
		assertEquals("Denver", customers.get(955).getCity());
	}

	@Test
	@DisplayName("Record 956: County is Denver")
	void CountyOfRecord956() {
		assertEquals("Denver", customers.get(955).getCounty());
	}

	@Test
	@DisplayName("Record 956: State is CO")
	void StateOfRecord956() {
		assertEquals("CO", customers.get(955).getState());
	}

	@Test
	@DisplayName("Record 956: ZIP is 80231")
	void ZIPOfRecord956() {
		assertEquals("80231", customers.get(955).getZIP());
	}

	@Test
	@DisplayName("Record 956: Phone is 303-752-0656")
	void PhoneOfRecord956() {
		assertEquals("303-752-0656", customers.get(955).getPhone());
	}

	@Test
	@DisplayName("Record 956: Fax is 303-752-5237")
	void FaxOfRecord956() {
		assertEquals("303-752-5237", customers.get(955).getFax());
	}

	@Test
	@DisplayName("Record 956: Email is cristopher@lazar.com")
	void EmailOfRecord956() {
		assertEquals("cristopher@lazar.com", customers.get(955).getEmail());
	}

	@Test
	@DisplayName("Record 956: Web is http://www.cristopherlazar.com")
	void WebOfRecord956() {
		assertEquals("http://www.cristopherlazar.com", customers.get(955).getWeb());
	}
}
