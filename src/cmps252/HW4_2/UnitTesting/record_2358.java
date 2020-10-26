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
class Record_2358 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2358: FirstName is Jay")
	void FirstNameOfRecord2358() {
		assertEquals("Jay", customers.get(2357).getFirstName());
	}

	@Test
	@DisplayName("Record 2358: LastName is Stierwalt")
	void LastNameOfRecord2358() {
		assertEquals("Stierwalt", customers.get(2357).getLastName());
	}

	@Test
	@DisplayName("Record 2358: Company is Icon Information Concepts Inc")
	void CompanyOfRecord2358() {
		assertEquals("Icon Information Concepts Inc", customers.get(2357).getCompany());
	}

	@Test
	@DisplayName("Record 2358: Address is Front Sts")
	void AddressOfRecord2358() {
		assertEquals("Front Sts", customers.get(2357).getAddress());
	}

	@Test
	@DisplayName("Record 2358: City is Bridgeport")
	void CityOfRecord2358() {
		assertEquals("Bridgeport", customers.get(2357).getCity());
	}

	@Test
	@DisplayName("Record 2358: County is Montgomery")
	void CountyOfRecord2358() {
		assertEquals("Montgomery", customers.get(2357).getCounty());
	}

	@Test
	@DisplayName("Record 2358: State is PA")
	void StateOfRecord2358() {
		assertEquals("PA", customers.get(2357).getState());
	}

	@Test
	@DisplayName("Record 2358: ZIP is 19405")
	void ZIPOfRecord2358() {
		assertEquals("19405", customers.get(2357).getZIP());
	}

	@Test
	@DisplayName("Record 2358: Phone is 610-277-4127")
	void PhoneOfRecord2358() {
		assertEquals("610-277-4127", customers.get(2357).getPhone());
	}

	@Test
	@DisplayName("Record 2358: Fax is 610-277-8264")
	void FaxOfRecord2358() {
		assertEquals("610-277-8264", customers.get(2357).getFax());
	}

	@Test
	@DisplayName("Record 2358: Email is jay@stierwalt.com")
	void EmailOfRecord2358() {
		assertEquals("jay@stierwalt.com", customers.get(2357).getEmail());
	}

	@Test
	@DisplayName("Record 2358: Web is http://www.jaystierwalt.com")
	void WebOfRecord2358() {
		assertEquals("http://www.jaystierwalt.com", customers.get(2357).getWeb());
	}
}
