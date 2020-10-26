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

@Tag("46")
class Record_3960 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3960: FirstName is Therese")
	void FirstNameOfRecord3960() {
		assertEquals("Therese", customers.get(3959).getFirstName());
	}

	@Test
	@DisplayName("Record 3960: LastName is Vanosdol")
	void LastNameOfRecord3960() {
		assertEquals("Vanosdol", customers.get(3959).getLastName());
	}

	@Test
	@DisplayName("Record 3960: Company is Schrandt, Judith D Esq")
	void CompanyOfRecord3960() {
		assertEquals("Schrandt, Judith D Esq", customers.get(3959).getCompany());
	}

	@Test
	@DisplayName("Record 3960: Address is 37 Warehouse Point Rd")
	void AddressOfRecord3960() {
		assertEquals("37 Warehouse Point Rd", customers.get(3959).getAddress());
	}

	@Test
	@DisplayName("Record 3960: City is Wallingford")
	void CityOfRecord3960() {
		assertEquals("Wallingford", customers.get(3959).getCity());
	}

	@Test
	@DisplayName("Record 3960: County is New Haven")
	void CountyOfRecord3960() {
		assertEquals("New Haven", customers.get(3959).getCounty());
	}

	@Test
	@DisplayName("Record 3960: State is CT")
	void StateOfRecord3960() {
		assertEquals("CT", customers.get(3959).getState());
	}

	@Test
	@DisplayName("Record 3960: ZIP is 6492")
	void ZIPOfRecord3960() {
		assertEquals("6492", customers.get(3959).getZIP());
	}

	@Test
	@DisplayName("Record 3960: Phone is 203-269-5565")
	void PhoneOfRecord3960() {
		assertEquals("203-269-5565", customers.get(3959).getPhone());
	}

	@Test
	@DisplayName("Record 3960: Fax is 203-269-6359")
	void FaxOfRecord3960() {
		assertEquals("203-269-6359", customers.get(3959).getFax());
	}

	@Test
	@DisplayName("Record 3960: Email is therese@vanosdol.com")
	void EmailOfRecord3960() {
		assertEquals("therese@vanosdol.com", customers.get(3959).getEmail());
	}

	@Test
	@DisplayName("Record 3960: Web is http://www.theresevanosdol.com")
	void WebOfRecord3960() {
		assertEquals("http://www.theresevanosdol.com", customers.get(3959).getWeb());
	}
}
