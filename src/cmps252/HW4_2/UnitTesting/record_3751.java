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

@Tag("49")
class Record_3751 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3751: FirstName is Edna")
	void FirstNameOfRecord3751() {
		assertEquals("Edna", customers.get(3750).getFirstName());
	}

	@Test
	@DisplayName("Record 3751: LastName is Forgie")
	void LastNameOfRecord3751() {
		assertEquals("Forgie", customers.get(3750).getLastName());
	}

	@Test
	@DisplayName("Record 3751: Company is Frank Devlin Assoc")
	void CompanyOfRecord3751() {
		assertEquals("Frank Devlin Assoc", customers.get(3750).getCompany());
	}

	@Test
	@DisplayName("Record 3751: Address is 3901 Chinden Blvd")
	void AddressOfRecord3751() {
		assertEquals("3901 Chinden Blvd", customers.get(3750).getAddress());
	}

	@Test
	@DisplayName("Record 3751: City is Garden City")
	void CityOfRecord3751() {
		assertEquals("Garden City", customers.get(3750).getCity());
	}

	@Test
	@DisplayName("Record 3751: County is Ada")
	void CountyOfRecord3751() {
		assertEquals("Ada", customers.get(3750).getCounty());
	}

	@Test
	@DisplayName("Record 3751: State is ID")
	void StateOfRecord3751() {
		assertEquals("ID", customers.get(3750).getState());
	}

	@Test
	@DisplayName("Record 3751: ZIP is 83714")
	void ZIPOfRecord3751() {
		assertEquals("83714", customers.get(3750).getZIP());
	}

	@Test
	@DisplayName("Record 3751: Phone is 208-344-5301")
	void PhoneOfRecord3751() {
		assertEquals("208-344-5301", customers.get(3750).getPhone());
	}

	@Test
	@DisplayName("Record 3751: Fax is 208-344-9194")
	void FaxOfRecord3751() {
		assertEquals("208-344-9194", customers.get(3750).getFax());
	}

	@Test
	@DisplayName("Record 3751: Email is edna@forgie.com")
	void EmailOfRecord3751() {
		assertEquals("edna@forgie.com", customers.get(3750).getEmail());
	}

	@Test
	@DisplayName("Record 3751: Web is http://www.ednaforgie.com")
	void WebOfRecord3751() {
		assertEquals("http://www.ednaforgie.com", customers.get(3750).getWeb());
	}
}
