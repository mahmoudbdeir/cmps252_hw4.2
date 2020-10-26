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

@Tag("8")
class Record_2970 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2970: FirstName is Rhonda")
	void FirstNameOfRecord2970() {
		assertEquals("Rhonda", customers.get(2969).getFirstName());
	}

	@Test
	@DisplayName("Record 2970: LastName is Barcellos")
	void LastNameOfRecord2970() {
		assertEquals("Barcellos", customers.get(2969).getLastName());
	}

	@Test
	@DisplayName("Record 2970: Company is Murnane, Robert W Esq")
	void CompanyOfRecord2970() {
		assertEquals("Murnane, Robert W Esq", customers.get(2969).getCompany());
	}

	@Test
	@DisplayName("Record 2970: Address is 2320 Westwood Blvd")
	void AddressOfRecord2970() {
		assertEquals("2320 Westwood Blvd", customers.get(2969).getAddress());
	}

	@Test
	@DisplayName("Record 2970: City is Los Angeles")
	void CityOfRecord2970() {
		assertEquals("Los Angeles", customers.get(2969).getCity());
	}

	@Test
	@DisplayName("Record 2970: County is Los Angeles")
	void CountyOfRecord2970() {
		assertEquals("Los Angeles", customers.get(2969).getCounty());
	}

	@Test
	@DisplayName("Record 2970: State is CA")
	void StateOfRecord2970() {
		assertEquals("CA", customers.get(2969).getState());
	}

	@Test
	@DisplayName("Record 2970: ZIP is 90064")
	void ZIPOfRecord2970() {
		assertEquals("90064", customers.get(2969).getZIP());
	}

	@Test
	@DisplayName("Record 2970: Phone is 310-474-8978")
	void PhoneOfRecord2970() {
		assertEquals("310-474-8978", customers.get(2969).getPhone());
	}

	@Test
	@DisplayName("Record 2970: Fax is 310-474-0625")
	void FaxOfRecord2970() {
		assertEquals("310-474-0625", customers.get(2969).getFax());
	}

	@Test
	@DisplayName("Record 2970: Email is rhonda@barcellos.com")
	void EmailOfRecord2970() {
		assertEquals("rhonda@barcellos.com", customers.get(2969).getEmail());
	}

	@Test
	@DisplayName("Record 2970: Web is http://www.rhondabarcellos.com")
	void WebOfRecord2970() {
		assertEquals("http://www.rhondabarcellos.com", customers.get(2969).getWeb());
	}
}
