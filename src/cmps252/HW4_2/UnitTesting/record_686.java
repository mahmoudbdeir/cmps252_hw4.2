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

@Tag("6")
class Record_686 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 686: FirstName is Billie")
	void FirstNameOfRecord686() {
		assertEquals("Billie", customers.get(685).getFirstName());
	}

	@Test
	@DisplayName("Record 686: LastName is Rivenberg")
	void LastNameOfRecord686() {
		assertEquals("Rivenberg", customers.get(685).getLastName());
	}

	@Test
	@DisplayName("Record 686: Company is Cabbage, Elwin F Esq")
	void CompanyOfRecord686() {
		assertEquals("Cabbage, Elwin F Esq", customers.get(685).getCompany());
	}

	@Test
	@DisplayName("Record 686: Address is 2095 Frank Ave")
	void AddressOfRecord686() {
		assertEquals("2095 Frank Ave", customers.get(685).getAddress());
	}

	@Test
	@DisplayName("Record 686: City is Fairbanks")
	void CityOfRecord686() {
		assertEquals("Fairbanks", customers.get(685).getCity());
	}

	@Test
	@DisplayName("Record 686: County is Fairbanks North Star")
	void CountyOfRecord686() {
		assertEquals("Fairbanks North Star", customers.get(685).getCounty());
	}

	@Test
	@DisplayName("Record 686: State is AK")
	void StateOfRecord686() {
		assertEquals("AK", customers.get(685).getState());
	}

	@Test
	@DisplayName("Record 686: ZIP is 99701")
	void ZIPOfRecord686() {
		assertEquals("99701", customers.get(685).getZIP());
	}

	@Test
	@DisplayName("Record 686: Phone is 907-451-0587")
	void PhoneOfRecord686() {
		assertEquals("907-451-0587", customers.get(685).getPhone());
	}

	@Test
	@DisplayName("Record 686: Fax is 907-451-3336")
	void FaxOfRecord686() {
		assertEquals("907-451-3336", customers.get(685).getFax());
	}

	@Test
	@DisplayName("Record 686: Email is billie@rivenberg.com")
	void EmailOfRecord686() {
		assertEquals("billie@rivenberg.com", customers.get(685).getEmail());
	}

	@Test
	@DisplayName("Record 686: Web is http://www.billierivenberg.com")
	void WebOfRecord686() {
		assertEquals("http://www.billierivenberg.com", customers.get(685).getWeb());
	}
}
