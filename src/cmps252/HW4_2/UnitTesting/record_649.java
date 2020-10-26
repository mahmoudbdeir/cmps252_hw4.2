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

@Tag("15")
class Record_649 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 649: FirstName is Kaitlin")
	void FirstNameOfRecord649() {
		assertEquals("Kaitlin", customers.get(648).getFirstName());
	}

	@Test
	@DisplayName("Record 649: LastName is Peavey")
	void LastNameOfRecord649() {
		assertEquals("Peavey", customers.get(648).getLastName());
	}

	@Test
	@DisplayName("Record 649: Company is Whitlock, Richard R Jr")
	void CompanyOfRecord649() {
		assertEquals("Whitlock, Richard R Jr", customers.get(648).getCompany());
	}

	@Test
	@DisplayName("Record 649: Address is 2200 Denton Dr  #-103")
	void AddressOfRecord649() {
		assertEquals("2200 Denton Dr  #-103", customers.get(648).getAddress());
	}

	@Test
	@DisplayName("Record 649: City is Austin")
	void CityOfRecord649() {
		assertEquals("Austin", customers.get(648).getCity());
	}

	@Test
	@DisplayName("Record 649: County is Travis")
	void CountyOfRecord649() {
		assertEquals("Travis", customers.get(648).getCounty());
	}

	@Test
	@DisplayName("Record 649: State is TX")
	void StateOfRecord649() {
		assertEquals("TX", customers.get(648).getState());
	}

	@Test
	@DisplayName("Record 649: ZIP is 78758")
	void ZIPOfRecord649() {
		assertEquals("78758", customers.get(648).getZIP());
	}

	@Test
	@DisplayName("Record 649: Phone is 512-837-8351")
	void PhoneOfRecord649() {
		assertEquals("512-837-8351", customers.get(648).getPhone());
	}

	@Test
	@DisplayName("Record 649: Fax is 512-837-1742")
	void FaxOfRecord649() {
		assertEquals("512-837-1742", customers.get(648).getFax());
	}

	@Test
	@DisplayName("Record 649: Email is kaitlin@peavey.com")
	void EmailOfRecord649() {
		assertEquals("kaitlin@peavey.com", customers.get(648).getEmail());
	}

	@Test
	@DisplayName("Record 649: Web is http://www.kaitlinpeavey.com")
	void WebOfRecord649() {
		assertEquals("http://www.kaitlinpeavey.com", customers.get(648).getWeb());
	}
}
