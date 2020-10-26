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

@Tag("17")
class Record_2528 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2528: FirstName is Hillary")
	void FirstNameOfRecord2528() {
		assertEquals("Hillary", customers.get(2527).getFirstName());
	}

	@Test
	@DisplayName("Record 2528: LastName is Deklerk")
	void LastNameOfRecord2528() {
		assertEquals("Deklerk", customers.get(2527).getLastName());
	}

	@Test
	@DisplayName("Record 2528: Company is Oncology Center Of The South")
	void CompanyOfRecord2528() {
		assertEquals("Oncology Center Of The South", customers.get(2527).getCompany());
	}

	@Test
	@DisplayName("Record 2528: Address is 1019 Central Pky N")
	void AddressOfRecord2528() {
		assertEquals("1019 Central Pky N", customers.get(2527).getAddress());
	}

	@Test
	@DisplayName("Record 2528: City is San Antonio")
	void CityOfRecord2528() {
		assertEquals("San Antonio", customers.get(2527).getCity());
	}

	@Test
	@DisplayName("Record 2528: County is Bexar")
	void CountyOfRecord2528() {
		assertEquals("Bexar", customers.get(2527).getCounty());
	}

	@Test
	@DisplayName("Record 2528: State is TX")
	void StateOfRecord2528() {
		assertEquals("TX", customers.get(2527).getState());
	}

	@Test
	@DisplayName("Record 2528: ZIP is 78232")
	void ZIPOfRecord2528() {
		assertEquals("78232", customers.get(2527).getZIP());
	}

	@Test
	@DisplayName("Record 2528: Phone is 210-545-7614")
	void PhoneOfRecord2528() {
		assertEquals("210-545-7614", customers.get(2527).getPhone());
	}

	@Test
	@DisplayName("Record 2528: Fax is 210-545-7964")
	void FaxOfRecord2528() {
		assertEquals("210-545-7964", customers.get(2527).getFax());
	}

	@Test
	@DisplayName("Record 2528: Email is hillary@deklerk.com")
	void EmailOfRecord2528() {
		assertEquals("hillary@deklerk.com", customers.get(2527).getEmail());
	}

	@Test
	@DisplayName("Record 2528: Web is http://www.hillarydeklerk.com")
	void WebOfRecord2528() {
		assertEquals("http://www.hillarydeklerk.com", customers.get(2527).getWeb());
	}
}
