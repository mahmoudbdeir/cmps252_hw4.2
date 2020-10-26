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

@Tag("45")
class Record_2620 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2620: FirstName is Imelda")
	void FirstNameOfRecord2620() {
		assertEquals("Imelda", customers.get(2619).getFirstName());
	}

	@Test
	@DisplayName("Record 2620: LastName is Congrove")
	void LastNameOfRecord2620() {
		assertEquals("Congrove", customers.get(2619).getLastName());
	}

	@Test
	@DisplayName("Record 2620: Company is Mamana, Frank J Esq")
	void CompanyOfRecord2620() {
		assertEquals("Mamana, Frank J Esq", customers.get(2619).getCompany());
	}

	@Test
	@DisplayName("Record 2620: Address is 4627 New Utrecht Ave")
	void AddressOfRecord2620() {
		assertEquals("4627 New Utrecht Ave", customers.get(2619).getAddress());
	}

	@Test
	@DisplayName("Record 2620: City is Brooklyn")
	void CityOfRecord2620() {
		assertEquals("Brooklyn", customers.get(2619).getCity());
	}

	@Test
	@DisplayName("Record 2620: County is Kings")
	void CountyOfRecord2620() {
		assertEquals("Kings", customers.get(2619).getCounty());
	}

	@Test
	@DisplayName("Record 2620: State is NY")
	void StateOfRecord2620() {
		assertEquals("NY", customers.get(2619).getState());
	}

	@Test
	@DisplayName("Record 2620: ZIP is 11219")
	void ZIPOfRecord2620() {
		assertEquals("11219", customers.get(2619).getZIP());
	}

	@Test
	@DisplayName("Record 2620: Phone is 718-435-4402")
	void PhoneOfRecord2620() {
		assertEquals("718-435-4402", customers.get(2619).getPhone());
	}

	@Test
	@DisplayName("Record 2620: Fax is 718-435-7115")
	void FaxOfRecord2620() {
		assertEquals("718-435-7115", customers.get(2619).getFax());
	}

	@Test
	@DisplayName("Record 2620: Email is imelda@congrove.com")
	void EmailOfRecord2620() {
		assertEquals("imelda@congrove.com", customers.get(2619).getEmail());
	}

	@Test
	@DisplayName("Record 2620: Web is http://www.imeldacongrove.com")
	void WebOfRecord2620() {
		assertEquals("http://www.imeldacongrove.com", customers.get(2619).getWeb());
	}
}
