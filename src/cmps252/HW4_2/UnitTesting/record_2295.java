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
class Record_2295 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2295: FirstName is Hilton")
	void FirstNameOfRecord2295() {
		assertEquals("Hilton", customers.get(2294).getFirstName());
	}

	@Test
	@DisplayName("Record 2295: LastName is Buhl")
	void LastNameOfRecord2295() {
		assertEquals("Buhl", customers.get(2294).getLastName());
	}

	@Test
	@DisplayName("Record 2295: Company is Betty Ks Subs & More")
	void CompanyOfRecord2295() {
		assertEquals("Betty Ks Subs & More", customers.get(2294).getCompany());
	}

	@Test
	@DisplayName("Record 2295: Address is 1390 Flynn Rd  #-g")
	void AddressOfRecord2295() {
		assertEquals("1390 Flynn Rd  #-g", customers.get(2294).getAddress());
	}

	@Test
	@DisplayName("Record 2295: City is Camarillo")
	void CityOfRecord2295() {
		assertEquals("Camarillo", customers.get(2294).getCity());
	}

	@Test
	@DisplayName("Record 2295: County is Ventura")
	void CountyOfRecord2295() {
		assertEquals("Ventura", customers.get(2294).getCounty());
	}

	@Test
	@DisplayName("Record 2295: State is CA")
	void StateOfRecord2295() {
		assertEquals("CA", customers.get(2294).getState());
	}

	@Test
	@DisplayName("Record 2295: ZIP is 93012")
	void ZIPOfRecord2295() {
		assertEquals("93012", customers.get(2294).getZIP());
	}

	@Test
	@DisplayName("Record 2295: Phone is 805-482-5174")
	void PhoneOfRecord2295() {
		assertEquals("805-482-5174", customers.get(2294).getPhone());
	}

	@Test
	@DisplayName("Record 2295: Fax is 805-482-1751")
	void FaxOfRecord2295() {
		assertEquals("805-482-1751", customers.get(2294).getFax());
	}

	@Test
	@DisplayName("Record 2295: Email is hilton@buhl.com")
	void EmailOfRecord2295() {
		assertEquals("hilton@buhl.com", customers.get(2294).getEmail());
	}

	@Test
	@DisplayName("Record 2295: Web is http://www.hiltonbuhl.com")
	void WebOfRecord2295() {
		assertEquals("http://www.hiltonbuhl.com", customers.get(2294).getWeb());
	}
}
