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

@Tag("31")
class Record_177 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 177: FirstName is Jerald")
	void FirstNameOfRecord177() {
		assertEquals("Jerald", customers.get(176).getFirstName());
	}

	@Test
	@DisplayName("Record 177: LastName is Kanarek")
	void LastNameOfRecord177() {
		assertEquals("Kanarek", customers.get(176).getLastName());
	}

	@Test
	@DisplayName("Record 177: Company is Marine Warehouse")
	void CompanyOfRecord177() {
		assertEquals("Marine Warehouse", customers.get(176).getCompany());
	}

	@Test
	@DisplayName("Record 177: Address is 214 N D St")
	void AddressOfRecord177() {
		assertEquals("214 N D St", customers.get(176).getAddress());
	}

	@Test
	@DisplayName("Record 177: City is Lompoc")
	void CityOfRecord177() {
		assertEquals("Lompoc", customers.get(176).getCity());
	}

	@Test
	@DisplayName("Record 177: County is Santa Barbara")
	void CountyOfRecord177() {
		assertEquals("Santa Barbara", customers.get(176).getCounty());
	}

	@Test
	@DisplayName("Record 177: State is CA")
	void StateOfRecord177() {
		assertEquals("CA", customers.get(176).getState());
	}

	@Test
	@DisplayName("Record 177: ZIP is 93436")
	void ZIPOfRecord177() {
		assertEquals("93436", customers.get(176).getZIP());
	}

	@Test
	@DisplayName("Record 177: Phone is 805-736-2032")
	void PhoneOfRecord177() {
		assertEquals("805-736-2032", customers.get(176).getPhone());
	}

	@Test
	@DisplayName("Record 177: Fax is 805-736-5297")
	void FaxOfRecord177() {
		assertEquals("805-736-5297", customers.get(176).getFax());
	}

	@Test
	@DisplayName("Record 177: Email is jerald@kanarek.com")
	void EmailOfRecord177() {
		assertEquals("jerald@kanarek.com", customers.get(176).getEmail());
	}

	@Test
	@DisplayName("Record 177: Web is http://www.jeraldkanarek.com")
	void WebOfRecord177() {
		assertEquals("http://www.jeraldkanarek.com", customers.get(176).getWeb());
	}
}
