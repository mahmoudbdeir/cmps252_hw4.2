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

@Tag("16")
class Record_2506 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2506: FirstName is Jesse")
	void FirstNameOfRecord2506() {
		assertEquals("Jesse", customers.get(2505).getFirstName());
	}

	@Test
	@DisplayName("Record 2506: LastName is Huewe")
	void LastNameOfRecord2506() {
		assertEquals("Huewe", customers.get(2505).getLastName());
	}

	@Test
	@DisplayName("Record 2506: Company is Kravec, Joseph N Jr")
	void CompanyOfRecord2506() {
		assertEquals("Kravec, Joseph N Jr", customers.get(2505).getCompany());
	}

	@Test
	@DisplayName("Record 2506: Address is 780 S Main St")
	void AddressOfRecord2506() {
		assertEquals("780 S Main St", customers.get(2505).getAddress());
	}

	@Test
	@DisplayName("Record 2506: City is Lebanon")
	void CityOfRecord2506() {
		assertEquals("Lebanon", customers.get(2505).getCity());
	}

	@Test
	@DisplayName("Record 2506: County is Linn")
	void CountyOfRecord2506() {
		assertEquals("Linn", customers.get(2505).getCounty());
	}

	@Test
	@DisplayName("Record 2506: State is OR")
	void StateOfRecord2506() {
		assertEquals("OR", customers.get(2505).getState());
	}

	@Test
	@DisplayName("Record 2506: ZIP is 97355")
	void ZIPOfRecord2506() {
		assertEquals("97355", customers.get(2505).getZIP());
	}

	@Test
	@DisplayName("Record 2506: Phone is 541-451-9881")
	void PhoneOfRecord2506() {
		assertEquals("541-451-9881", customers.get(2505).getPhone());
	}

	@Test
	@DisplayName("Record 2506: Fax is 541-451-2247")
	void FaxOfRecord2506() {
		assertEquals("541-451-2247", customers.get(2505).getFax());
	}

	@Test
	@DisplayName("Record 2506: Email is jesse@huewe.com")
	void EmailOfRecord2506() {
		assertEquals("jesse@huewe.com", customers.get(2505).getEmail());
	}

	@Test
	@DisplayName("Record 2506: Web is http://www.jessehuewe.com")
	void WebOfRecord2506() {
		assertEquals("http://www.jessehuewe.com", customers.get(2505).getWeb());
	}
}
