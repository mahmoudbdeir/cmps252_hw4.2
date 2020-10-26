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

@Tag("16")
class Record_891 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 891: FirstName is Hans")
	void FirstNameOfRecord891() {
		assertEquals("Hans", customers.get(890).getFirstName());
	}

	@Test
	@DisplayName("Record 891: LastName is Schlote")
	void LastNameOfRecord891() {
		assertEquals("Schlote", customers.get(890).getLastName());
	}

	@Test
	@DisplayName("Record 891: Company is Siegel, David B Esq")
	void CompanyOfRecord891() {
		assertEquals("Siegel, David B Esq", customers.get(890).getCompany());
	}

	@Test
	@DisplayName("Record 891: Address is 621 S Almond St")
	void AddressOfRecord891() {
		assertEquals("621 S Almond St", customers.get(890).getAddress());
	}

	@Test
	@DisplayName("Record 891: City is Fall River")
	void CityOfRecord891() {
		assertEquals("Fall River", customers.get(890).getCity());
	}

	@Test
	@DisplayName("Record 891: County is Bristol")
	void CountyOfRecord891() {
		assertEquals("Bristol", customers.get(890).getCounty());
	}

	@Test
	@DisplayName("Record 891: State is MA")
	void StateOfRecord891() {
		assertEquals("MA", customers.get(890).getState());
	}

	@Test
	@DisplayName("Record 891: ZIP is 2724")
	void ZIPOfRecord891() {
		assertEquals("2724", customers.get(890).getZIP());
	}

	@Test
	@DisplayName("Record 891: Phone is 508-676-6422")
	void PhoneOfRecord891() {
		assertEquals("508-676-6422", customers.get(890).getPhone());
	}

	@Test
	@DisplayName("Record 891: Fax is 508-676-6647")
	void FaxOfRecord891() {
		assertEquals("508-676-6647", customers.get(890).getFax());
	}

	@Test
	@DisplayName("Record 891: Email is hans@schlote.com")
	void EmailOfRecord891() {
		assertEquals("hans@schlote.com", customers.get(890).getEmail());
	}

	@Test
	@DisplayName("Record 891: Web is http://www.hansschlote.com")
	void WebOfRecord891() {
		assertEquals("http://www.hansschlote.com", customers.get(890).getWeb());
	}
}
