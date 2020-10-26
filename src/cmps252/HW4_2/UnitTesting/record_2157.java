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

@Tag("4")
class Record_2157 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2157: FirstName is Laurel")
	void FirstNameOfRecord2157() {
		assertEquals("Laurel", customers.get(2156).getFirstName());
	}

	@Test
	@DisplayName("Record 2157: LastName is Hibbits")
	void LastNameOfRecord2157() {
		assertEquals("Hibbits", customers.get(2156).getLastName());
	}

	@Test
	@DisplayName("Record 2157: Company is Marshall Manufacturing Corp")
	void CompanyOfRecord2157() {
		assertEquals("Marshall Manufacturing Corp", customers.get(2156).getCompany());
	}

	@Test
	@DisplayName("Record 2157: Address is 177 University Ave")
	void AddressOfRecord2157() {
		assertEquals("177 University Ave", customers.get(2156).getAddress());
	}

	@Test
	@DisplayName("Record 2157: City is Rochester")
	void CityOfRecord2157() {
		assertEquals("Rochester", customers.get(2156).getCity());
	}

	@Test
	@DisplayName("Record 2157: County is Monroe")
	void CountyOfRecord2157() {
		assertEquals("Monroe", customers.get(2156).getCounty());
	}

	@Test
	@DisplayName("Record 2157: State is NY")
	void StateOfRecord2157() {
		assertEquals("NY", customers.get(2156).getState());
	}

	@Test
	@DisplayName("Record 2157: ZIP is 14605")
	void ZIPOfRecord2157() {
		assertEquals("14605", customers.get(2156).getZIP());
	}

	@Test
	@DisplayName("Record 2157: Phone is 585-262-6468")
	void PhoneOfRecord2157() {
		assertEquals("585-262-6468", customers.get(2156).getPhone());
	}

	@Test
	@DisplayName("Record 2157: Fax is 585-262-8582")
	void FaxOfRecord2157() {
		assertEquals("585-262-8582", customers.get(2156).getFax());
	}

	@Test
	@DisplayName("Record 2157: Email is laurel@hibbits.com")
	void EmailOfRecord2157() {
		assertEquals("laurel@hibbits.com", customers.get(2156).getEmail());
	}

	@Test
	@DisplayName("Record 2157: Web is http://www.laurelhibbits.com")
	void WebOfRecord2157() {
		assertEquals("http://www.laurelhibbits.com", customers.get(2156).getWeb());
	}
}
