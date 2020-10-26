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
class Record_2535 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2535: FirstName is Gerald")
	void FirstNameOfRecord2535() {
		assertEquals("Gerald", customers.get(2534).getFirstName());
	}

	@Test
	@DisplayName("Record 2535: LastName is Beyersdorf")
	void LastNameOfRecord2535() {
		assertEquals("Beyersdorf", customers.get(2534).getLastName());
	}

	@Test
	@DisplayName("Record 2535: Company is Denaburg, Edmond R")
	void CompanyOfRecord2535() {
		assertEquals("Denaburg, Edmond R", customers.get(2534).getCompany());
	}

	@Test
	@DisplayName("Record 2535: Address is 3875 Heaton Rd")
	void AddressOfRecord2535() {
		assertEquals("3875 Heaton Rd", customers.get(2534).getAddress());
	}

	@Test
	@DisplayName("Record 2535: City is Huntingdon Valley")
	void CityOfRecord2535() {
		assertEquals("Huntingdon Valley", customers.get(2534).getCity());
	}

	@Test
	@DisplayName("Record 2535: County is Montgomery")
	void CountyOfRecord2535() {
		assertEquals("Montgomery", customers.get(2534).getCounty());
	}

	@Test
	@DisplayName("Record 2535: State is PA")
	void StateOfRecord2535() {
		assertEquals("PA", customers.get(2534).getState());
	}

	@Test
	@DisplayName("Record 2535: ZIP is 19006")
	void ZIPOfRecord2535() {
		assertEquals("19006", customers.get(2534).getZIP());
	}

	@Test
	@DisplayName("Record 2535: Phone is 215-322-0570")
	void PhoneOfRecord2535() {
		assertEquals("215-322-0570", customers.get(2534).getPhone());
	}

	@Test
	@DisplayName("Record 2535: Fax is 215-322-0995")
	void FaxOfRecord2535() {
		assertEquals("215-322-0995", customers.get(2534).getFax());
	}

	@Test
	@DisplayName("Record 2535: Email is gerald@beyersdorf.com")
	void EmailOfRecord2535() {
		assertEquals("gerald@beyersdorf.com", customers.get(2534).getEmail());
	}

	@Test
	@DisplayName("Record 2535: Web is http://www.geraldbeyersdorf.com")
	void WebOfRecord2535() {
		assertEquals("http://www.geraldbeyersdorf.com", customers.get(2534).getWeb());
	}
}
