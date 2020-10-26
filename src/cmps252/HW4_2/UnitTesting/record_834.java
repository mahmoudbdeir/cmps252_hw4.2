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

@Tag("20")
class Record_834 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 834: FirstName is Sanford")
	void FirstNameOfRecord834() {
		assertEquals("Sanford", customers.get(833).getFirstName());
	}

	@Test
	@DisplayName("Record 834: LastName is Dodgen")
	void LastNameOfRecord834() {
		assertEquals("Dodgen", customers.get(833).getLastName());
	}

	@Test
	@DisplayName("Record 834: Company is Edmundson, Jasper N Esq")
	void CompanyOfRecord834() {
		assertEquals("Edmundson, Jasper N Esq", customers.get(833).getCompany());
	}

	@Test
	@DisplayName("Record 834: Address is 106 Dutchess Tpke")
	void AddressOfRecord834() {
		assertEquals("106 Dutchess Tpke", customers.get(833).getAddress());
	}

	@Test
	@DisplayName("Record 834: City is Poughkeepsie")
	void CityOfRecord834() {
		assertEquals("Poughkeepsie", customers.get(833).getCity());
	}

	@Test
	@DisplayName("Record 834: County is Dutchess")
	void CountyOfRecord834() {
		assertEquals("Dutchess", customers.get(833).getCounty());
	}

	@Test
	@DisplayName("Record 834: State is NY")
	void StateOfRecord834() {
		assertEquals("NY", customers.get(833).getState());
	}

	@Test
	@DisplayName("Record 834: ZIP is 12603")
	void ZIPOfRecord834() {
		assertEquals("12603", customers.get(833).getZIP());
	}

	@Test
	@DisplayName("Record 834: Phone is 845-635-3930")
	void PhoneOfRecord834() {
		assertEquals("845-635-3930", customers.get(833).getPhone());
	}

	@Test
	@DisplayName("Record 834: Fax is 845-635-2542")
	void FaxOfRecord834() {
		assertEquals("845-635-2542", customers.get(833).getFax());
	}

	@Test
	@DisplayName("Record 834: Email is sanford@dodgen.com")
	void EmailOfRecord834() {
		assertEquals("sanford@dodgen.com", customers.get(833).getEmail());
	}

	@Test
	@DisplayName("Record 834: Web is http://www.sanforddodgen.com")
	void WebOfRecord834() {
		assertEquals("http://www.sanforddodgen.com", customers.get(833).getWeb());
	}
}
