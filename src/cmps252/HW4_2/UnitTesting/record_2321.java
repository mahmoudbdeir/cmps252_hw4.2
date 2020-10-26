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

@Tag("26")
class Record_2321 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2321: FirstName is Darnell")
	void FirstNameOfRecord2321() {
		assertEquals("Darnell", customers.get(2320).getFirstName());
	}

	@Test
	@DisplayName("Record 2321: LastName is Kapsalis")
	void LastNameOfRecord2321() {
		assertEquals("Kapsalis", customers.get(2320).getLastName());
	}

	@Test
	@DisplayName("Record 2321: Company is Express Personnel Services")
	void CompanyOfRecord2321() {
		assertEquals("Express Personnel Services", customers.get(2320).getCompany());
	}

	@Test
	@DisplayName("Record 2321: Address is 1150 El Camino Real")
	void AddressOfRecord2321() {
		assertEquals("1150 El Camino Real", customers.get(2320).getAddress());
	}

	@Test
	@DisplayName("Record 2321: City is Menlo Park")
	void CityOfRecord2321() {
		assertEquals("Menlo Park", customers.get(2320).getCity());
	}

	@Test
	@DisplayName("Record 2321: County is San Mateo")
	void CountyOfRecord2321() {
		assertEquals("San Mateo", customers.get(2320).getCounty());
	}

	@Test
	@DisplayName("Record 2321: State is CA")
	void StateOfRecord2321() {
		assertEquals("CA", customers.get(2320).getState());
	}

	@Test
	@DisplayName("Record 2321: ZIP is 94025")
	void ZIPOfRecord2321() {
		assertEquals("94025", customers.get(2320).getZIP());
	}

	@Test
	@DisplayName("Record 2321: Phone is 650-328-2849")
	void PhoneOfRecord2321() {
		assertEquals("650-328-2849", customers.get(2320).getPhone());
	}

	@Test
	@DisplayName("Record 2321: Fax is 650-328-2554")
	void FaxOfRecord2321() {
		assertEquals("650-328-2554", customers.get(2320).getFax());
	}

	@Test
	@DisplayName("Record 2321: Email is darnell@kapsalis.com")
	void EmailOfRecord2321() {
		assertEquals("darnell@kapsalis.com", customers.get(2320).getEmail());
	}

	@Test
	@DisplayName("Record 2321: Web is http://www.darnellkapsalis.com")
	void WebOfRecord2321() {
		assertEquals("http://www.darnellkapsalis.com", customers.get(2320).getWeb());
	}
}
