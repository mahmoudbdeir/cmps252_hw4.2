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

@Tag("47")
class Record_2554 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2554: FirstName is Kennith")
	void FirstNameOfRecord2554() {
		assertEquals("Kennith", customers.get(2553).getFirstName());
	}

	@Test
	@DisplayName("Record 2554: LastName is Hagmaier")
	void LastNameOfRecord2554() {
		assertEquals("Hagmaier", customers.get(2553).getLastName());
	}

	@Test
	@DisplayName("Record 2554: Company is C & D Tool & Machine Co")
	void CompanyOfRecord2554() {
		assertEquals("C & D Tool & Machine Co", customers.get(2553).getCompany());
	}

	@Test
	@DisplayName("Record 2554: Address is 325 W Main St")
	void AddressOfRecord2554() {
		assertEquals("325 W Main St", customers.get(2553).getAddress());
	}

	@Test
	@DisplayName("Record 2554: City is New Holland")
	void CityOfRecord2554() {
		assertEquals("New Holland", customers.get(2553).getCity());
	}

	@Test
	@DisplayName("Record 2554: County is Lancaster")
	void CountyOfRecord2554() {
		assertEquals("Lancaster", customers.get(2553).getCounty());
	}

	@Test
	@DisplayName("Record 2554: State is PA")
	void StateOfRecord2554() {
		assertEquals("PA", customers.get(2553).getState());
	}

	@Test
	@DisplayName("Record 2554: ZIP is 17557")
	void ZIPOfRecord2554() {
		assertEquals("17557", customers.get(2553).getZIP());
	}

	@Test
	@DisplayName("Record 2554: Phone is 717-354-8064")
	void PhoneOfRecord2554() {
		assertEquals("717-354-8064", customers.get(2553).getPhone());
	}

	@Test
	@DisplayName("Record 2554: Fax is 717-354-1087")
	void FaxOfRecord2554() {
		assertEquals("717-354-1087", customers.get(2553).getFax());
	}

	@Test
	@DisplayName("Record 2554: Email is kennith@hagmaier.com")
	void EmailOfRecord2554() {
		assertEquals("kennith@hagmaier.com", customers.get(2553).getEmail());
	}

	@Test
	@DisplayName("Record 2554: Web is http://www.kennithhagmaier.com")
	void WebOfRecord2554() {
		assertEquals("http://www.kennithhagmaier.com", customers.get(2553).getWeb());
	}
}
