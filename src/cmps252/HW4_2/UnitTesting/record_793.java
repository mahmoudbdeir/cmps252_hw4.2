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

@Tag("0")
class Record_793 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 793: FirstName is Mayra")
	void FirstNameOfRecord793() {
		assertEquals("Mayra", customers.get(792).getFirstName());
	}

	@Test
	@DisplayName("Record 793: LastName is Grismore")
	void LastNameOfRecord793() {
		assertEquals("Grismore", customers.get(792).getLastName());
	}

	@Test
	@DisplayName("Record 793: Company is Ward, Janet H Esq")
	void CompanyOfRecord793() {
		assertEquals("Ward, Janet H Esq", customers.get(792).getCompany());
	}

	@Test
	@DisplayName("Record 793: Address is 100 E Aurora Dr  #-319")
	void AddressOfRecord793() {
		assertEquals("100 E Aurora Dr  #-319", customers.get(792).getAddress());
	}

	@Test
	@DisplayName("Record 793: City is Laredo")
	void CityOfRecord793() {
		assertEquals("Laredo", customers.get(792).getCity());
	}

	@Test
	@DisplayName("Record 793: County is Webb")
	void CountyOfRecord793() {
		assertEquals("Webb", customers.get(792).getCounty());
	}

	@Test
	@DisplayName("Record 793: State is TX")
	void StateOfRecord793() {
		assertEquals("TX", customers.get(792).getState());
	}

	@Test
	@DisplayName("Record 793: ZIP is 78041")
	void ZIPOfRecord793() {
		assertEquals("78041", customers.get(792).getZIP());
	}

	@Test
	@DisplayName("Record 793: Phone is 956-717-5056")
	void PhoneOfRecord793() {
		assertEquals("956-717-5056", customers.get(792).getPhone());
	}

	@Test
	@DisplayName("Record 793: Fax is 956-717-5493")
	void FaxOfRecord793() {
		assertEquals("956-717-5493", customers.get(792).getFax());
	}

	@Test
	@DisplayName("Record 793: Email is mayra@grismore.com")
	void EmailOfRecord793() {
		assertEquals("mayra@grismore.com", customers.get(792).getEmail());
	}

	@Test
	@DisplayName("Record 793: Web is http://www.mayragrismore.com")
	void WebOfRecord793() {
		assertEquals("http://www.mayragrismore.com", customers.get(792).getWeb());
	}
}
