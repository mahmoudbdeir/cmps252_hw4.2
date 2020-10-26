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
class Record_1806 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1806: FirstName is Orville")
	void FirstNameOfRecord1806() {
		assertEquals("Orville", customers.get(1805).getFirstName());
	}

	@Test
	@DisplayName("Record 1806: LastName is Ordonez")
	void LastNameOfRecord1806() {
		assertEquals("Ordonez", customers.get(1805).getLastName());
	}

	@Test
	@DisplayName("Record 1806: Company is Premier Inns At Metro Ctr Mall")
	void CompanyOfRecord1806() {
		assertEquals("Premier Inns At Metro Ctr Mall", customers.get(1805).getCompany());
	}

	@Test
	@DisplayName("Record 1806: Address is 48 Tommy True Ct")
	void AddressOfRecord1806() {
		assertEquals("48 Tommy True Ct", customers.get(1805).getAddress());
	}

	@Test
	@DisplayName("Record 1806: City is Parkville")
	void CityOfRecord1806() {
		assertEquals("Parkville", customers.get(1805).getCity());
	}

	@Test
	@DisplayName("Record 1806: County is Baltimore")
	void CountyOfRecord1806() {
		assertEquals("Baltimore", customers.get(1805).getCounty());
	}

	@Test
	@DisplayName("Record 1806: State is MD")
	void StateOfRecord1806() {
		assertEquals("MD", customers.get(1805).getState());
	}

	@Test
	@DisplayName("Record 1806: ZIP is 21234")
	void ZIPOfRecord1806() {
		assertEquals("21234", customers.get(1805).getZIP());
	}

	@Test
	@DisplayName("Record 1806: Phone is 410-665-0894")
	void PhoneOfRecord1806() {
		assertEquals("410-665-0894", customers.get(1805).getPhone());
	}

	@Test
	@DisplayName("Record 1806: Fax is 410-665-1242")
	void FaxOfRecord1806() {
		assertEquals("410-665-1242", customers.get(1805).getFax());
	}

	@Test
	@DisplayName("Record 1806: Email is orville@ordonez.com")
	void EmailOfRecord1806() {
		assertEquals("orville@ordonez.com", customers.get(1805).getEmail());
	}

	@Test
	@DisplayName("Record 1806: Web is http://www.orvilleordonez.com")
	void WebOfRecord1806() {
		assertEquals("http://www.orvilleordonez.com", customers.get(1805).getWeb());
	}
}
