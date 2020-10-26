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

@Tag("43")
class Record_2545 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2545: FirstName is Carlene")
	void FirstNameOfRecord2545() {
		assertEquals("Carlene", customers.get(2544).getFirstName());
	}

	@Test
	@DisplayName("Record 2545: LastName is Tayo")
	void LastNameOfRecord2545() {
		assertEquals("Tayo", customers.get(2544).getLastName());
	}

	@Test
	@DisplayName("Record 2545: Company is Boyd Bilt Custom Cabinets")
	void CompanyOfRecord2545() {
		assertEquals("Boyd Bilt Custom Cabinets", customers.get(2544).getCompany());
	}

	@Test
	@DisplayName("Record 2545: Address is Chester Stst")
	void AddressOfRecord2545() {
		assertEquals("Chester Stst", customers.get(2544).getAddress());
	}

	@Test
	@DisplayName("Record 2545: City is Reading")
	void CityOfRecord2545() {
		assertEquals("Reading", customers.get(2544).getCity());
	}

	@Test
	@DisplayName("Record 2545: County is Berks")
	void CountyOfRecord2545() {
		assertEquals("Berks", customers.get(2544).getCounty());
	}

	@Test
	@DisplayName("Record 2545: State is PA")
	void StateOfRecord2545() {
		assertEquals("PA", customers.get(2544).getState());
	}

	@Test
	@DisplayName("Record 2545: ZIP is 19601")
	void ZIPOfRecord2545() {
		assertEquals("19601", customers.get(2544).getZIP());
	}

	@Test
	@DisplayName("Record 2545: Phone is 610-375-1753")
	void PhoneOfRecord2545() {
		assertEquals("610-375-1753", customers.get(2544).getPhone());
	}

	@Test
	@DisplayName("Record 2545: Fax is 610-375-0143")
	void FaxOfRecord2545() {
		assertEquals("610-375-0143", customers.get(2544).getFax());
	}

	@Test
	@DisplayName("Record 2545: Email is carlene@tayo.com")
	void EmailOfRecord2545() {
		assertEquals("carlene@tayo.com", customers.get(2544).getEmail());
	}

	@Test
	@DisplayName("Record 2545: Web is http://www.carlenetayo.com")
	void WebOfRecord2545() {
		assertEquals("http://www.carlenetayo.com", customers.get(2544).getWeb());
	}
}
