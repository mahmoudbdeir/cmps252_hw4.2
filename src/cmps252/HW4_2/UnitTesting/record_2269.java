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

@Tag("33")
class Record_2269 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2269: FirstName is Cari")
	void FirstNameOfRecord2269() {
		assertEquals("Cari", customers.get(2268).getFirstName());
	}

	@Test
	@DisplayName("Record 2269: LastName is Radune")
	void LastNameOfRecord2269() {
		assertEquals("Radune", customers.get(2268).getLastName());
	}

	@Test
	@DisplayName("Record 2269: Company is Kbce Fm B102")
	void CompanyOfRecord2269() {
		assertEquals("Kbce Fm B102", customers.get(2268).getCompany());
	}

	@Test
	@DisplayName("Record 2269: Address is 26 6th St  #-260")
	void AddressOfRecord2269() {
		assertEquals("26 6th St  #-260", customers.get(2268).getAddress());
	}

	@Test
	@DisplayName("Record 2269: City is Stamford")
	void CityOfRecord2269() {
		assertEquals("Stamford", customers.get(2268).getCity());
	}

	@Test
	@DisplayName("Record 2269: County is Fairfield")
	void CountyOfRecord2269() {
		assertEquals("Fairfield", customers.get(2268).getCounty());
	}

	@Test
	@DisplayName("Record 2269: State is CT")
	void StateOfRecord2269() {
		assertEquals("CT", customers.get(2268).getState());
	}

	@Test
	@DisplayName("Record 2269: ZIP is 6905")
	void ZIPOfRecord2269() {
		assertEquals("6905", customers.get(2268).getZIP());
	}

	@Test
	@DisplayName("Record 2269: Phone is 203-967-2808")
	void PhoneOfRecord2269() {
		assertEquals("203-967-2808", customers.get(2268).getPhone());
	}

	@Test
	@DisplayName("Record 2269: Fax is 203-967-6684")
	void FaxOfRecord2269() {
		assertEquals("203-967-6684", customers.get(2268).getFax());
	}

	@Test
	@DisplayName("Record 2269: Email is cari@radune.com")
	void EmailOfRecord2269() {
		assertEquals("cari@radune.com", customers.get(2268).getEmail());
	}

	@Test
	@DisplayName("Record 2269: Web is http://www.cariradune.com")
	void WebOfRecord2269() {
		assertEquals("http://www.cariradune.com", customers.get(2268).getWeb());
	}
}
