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

@Tag("48")
class Record_4125 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4125: FirstName is Sam")
	void FirstNameOfRecord4125() {
		assertEquals("Sam", customers.get(4124).getFirstName());
	}

	@Test
	@DisplayName("Record 4125: LastName is Aigner")
	void LastNameOfRecord4125() {
		assertEquals("Aigner", customers.get(4124).getLastName());
	}

	@Test
	@DisplayName("Record 4125: Company is Denison Chandler Ins Agcy")
	void CompanyOfRecord4125() {
		assertEquals("Denison Chandler Ins Agcy", customers.get(4124).getCompany());
	}

	@Test
	@DisplayName("Record 4125: Address is 2803 Broadway  #-a")
	void AddressOfRecord4125() {
		assertEquals("2803 Broadway  #-a", customers.get(4124).getAddress());
	}

	@Test
	@DisplayName("Record 4125: City is Fair Lawn")
	void CityOfRecord4125() {
		assertEquals("Fair Lawn", customers.get(4124).getCity());
	}

	@Test
	@DisplayName("Record 4125: County is Bergen")
	void CountyOfRecord4125() {
		assertEquals("Bergen", customers.get(4124).getCounty());
	}

	@Test
	@DisplayName("Record 4125: State is NJ")
	void StateOfRecord4125() {
		assertEquals("NJ", customers.get(4124).getState());
	}

	@Test
	@DisplayName("Record 4125: ZIP is 7410")
	void ZIPOfRecord4125() {
		assertEquals("7410", customers.get(4124).getZIP());
	}

	@Test
	@DisplayName("Record 4125: Phone is 201-794-6844")
	void PhoneOfRecord4125() {
		assertEquals("201-794-6844", customers.get(4124).getPhone());
	}

	@Test
	@DisplayName("Record 4125: Fax is 201-794-0714")
	void FaxOfRecord4125() {
		assertEquals("201-794-0714", customers.get(4124).getFax());
	}

	@Test
	@DisplayName("Record 4125: Email is sam@aigner.com")
	void EmailOfRecord4125() {
		assertEquals("sam@aigner.com", customers.get(4124).getEmail());
	}

	@Test
	@DisplayName("Record 4125: Web is http://www.samaigner.com")
	void WebOfRecord4125() {
		assertEquals("http://www.samaigner.com", customers.get(4124).getWeb());
	}
}
