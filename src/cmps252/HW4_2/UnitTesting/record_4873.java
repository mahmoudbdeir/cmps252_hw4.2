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

@Tag("10")
class Record_4873 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4873: FirstName is Barrett")
	void FirstNameOfRecord4873() {
		assertEquals("Barrett", customers.get(4872).getFirstName());
	}

	@Test
	@DisplayName("Record 4873: LastName is Arabie")
	void LastNameOfRecord4873() {
		assertEquals("Arabie", customers.get(4872).getLastName());
	}

	@Test
	@DisplayName("Record 4873: Company is Gray, Melanie Esq")
	void CompanyOfRecord4873() {
		assertEquals("Gray, Melanie Esq", customers.get(4872).getCompany());
	}

	@Test
	@DisplayName("Record 4873: Address is 806 Cape Cod Dr")
	void AddressOfRecord4873() {
		assertEquals("806 Cape Cod Dr", customers.get(4872).getAddress());
	}

	@Test
	@DisplayName("Record 4873: City is Evans")
	void CityOfRecord4873() {
		assertEquals("Evans", customers.get(4872).getCity());
	}

	@Test
	@DisplayName("Record 4873: County is Columbia")
	void CountyOfRecord4873() {
		assertEquals("Columbia", customers.get(4872).getCounty());
	}

	@Test
	@DisplayName("Record 4873: State is GA")
	void StateOfRecord4873() {
		assertEquals("GA", customers.get(4872).getState());
	}

	@Test
	@DisplayName("Record 4873: ZIP is 30809")
	void ZIPOfRecord4873() {
		assertEquals("30809", customers.get(4872).getZIP());
	}

	@Test
	@DisplayName("Record 4873: Phone is 706-869-1870")
	void PhoneOfRecord4873() {
		assertEquals("706-869-1870", customers.get(4872).getPhone());
	}

	@Test
	@DisplayName("Record 4873: Fax is 706-869-1808")
	void FaxOfRecord4873() {
		assertEquals("706-869-1808", customers.get(4872).getFax());
	}

	@Test
	@DisplayName("Record 4873: Email is barrett@arabie.com")
	void EmailOfRecord4873() {
		assertEquals("barrett@arabie.com", customers.get(4872).getEmail());
	}

	@Test
	@DisplayName("Record 4873: Web is http://www.barrettarabie.com")
	void WebOfRecord4873() {
		assertEquals("http://www.barrettarabie.com", customers.get(4872).getWeb());
	}
}
