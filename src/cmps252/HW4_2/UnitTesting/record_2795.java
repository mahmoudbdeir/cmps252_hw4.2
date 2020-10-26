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

@Tag("14")
class Record_2795 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2795: FirstName is Collin")
	void FirstNameOfRecord2795() {
		assertEquals("Collin", customers.get(2794).getFirstName());
	}

	@Test
	@DisplayName("Record 2795: LastName is Carrigan")
	void LastNameOfRecord2795() {
		assertEquals("Carrigan", customers.get(2794).getLastName());
	}

	@Test
	@DisplayName("Record 2795: Company is Trexler Watson And Michael Llp")
	void CompanyOfRecord2795() {
		assertEquals("Trexler Watson And Michael Llp", customers.get(2794).getCompany());
	}

	@Test
	@DisplayName("Record 2795: Address is 1271 Main St")
	void AddressOfRecord2795() {
		assertEquals("1271 Main St", customers.get(2794).getAddress());
	}

	@Test
	@DisplayName("Record 2795: City is Tewksbury")
	void CityOfRecord2795() {
		assertEquals("Tewksbury", customers.get(2794).getCity());
	}

	@Test
	@DisplayName("Record 2795: County is Middlesex")
	void CountyOfRecord2795() {
		assertEquals("Middlesex", customers.get(2794).getCounty());
	}

	@Test
	@DisplayName("Record 2795: State is MA")
	void StateOfRecord2795() {
		assertEquals("MA", customers.get(2794).getState());
	}

	@Test
	@DisplayName("Record 2795: ZIP is 1876")
	void ZIPOfRecord2795() {
		assertEquals("1876", customers.get(2794).getZIP());
	}

	@Test
	@DisplayName("Record 2795: Phone is 978-851-7218")
	void PhoneOfRecord2795() {
		assertEquals("978-851-7218", customers.get(2794).getPhone());
	}

	@Test
	@DisplayName("Record 2795: Fax is 978-851-8074")
	void FaxOfRecord2795() {
		assertEquals("978-851-8074", customers.get(2794).getFax());
	}

	@Test
	@DisplayName("Record 2795: Email is collin@carrigan.com")
	void EmailOfRecord2795() {
		assertEquals("collin@carrigan.com", customers.get(2794).getEmail());
	}

	@Test
	@DisplayName("Record 2795: Web is http://www.collincarrigan.com")
	void WebOfRecord2795() {
		assertEquals("http://www.collincarrigan.com", customers.get(2794).getWeb());
	}
}
