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

@Tag("23")
class Record_4763 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4763: FirstName is Lea")
	void FirstNameOfRecord4763() {
		assertEquals("Lea", customers.get(4762).getFirstName());
	}

	@Test
	@DisplayName("Record 4763: LastName is Runge")
	void LastNameOfRecord4763() {
		assertEquals("Runge", customers.get(4762).getLastName());
	}

	@Test
	@DisplayName("Record 4763: Company is Nationsbank")
	void CompanyOfRecord4763() {
		assertEquals("Nationsbank", customers.get(4762).getCompany());
	}

	@Test
	@DisplayName("Record 4763: Address is 9400 Activity Rd  #-b")
	void AddressOfRecord4763() {
		assertEquals("9400 Activity Rd  #-b", customers.get(4762).getAddress());
	}

	@Test
	@DisplayName("Record 4763: City is San Diego")
	void CityOfRecord4763() {
		assertEquals("San Diego", customers.get(4762).getCity());
	}

	@Test
	@DisplayName("Record 4763: County is San Diego")
	void CountyOfRecord4763() {
		assertEquals("San Diego", customers.get(4762).getCounty());
	}

	@Test
	@DisplayName("Record 4763: State is CA")
	void StateOfRecord4763() {
		assertEquals("CA", customers.get(4762).getState());
	}

	@Test
	@DisplayName("Record 4763: ZIP is 92126")
	void ZIPOfRecord4763() {
		assertEquals("92126", customers.get(4762).getZIP());
	}

	@Test
	@DisplayName("Record 4763: Phone is 858-578-8892")
	void PhoneOfRecord4763() {
		assertEquals("858-578-8892", customers.get(4762).getPhone());
	}

	@Test
	@DisplayName("Record 4763: Fax is 858-578-2974")
	void FaxOfRecord4763() {
		assertEquals("858-578-2974", customers.get(4762).getFax());
	}

	@Test
	@DisplayName("Record 4763: Email is lea@runge.com")
	void EmailOfRecord4763() {
		assertEquals("lea@runge.com", customers.get(4762).getEmail());
	}

	@Test
	@DisplayName("Record 4763: Web is http://www.learunge.com")
	void WebOfRecord4763() {
		assertEquals("http://www.learunge.com", customers.get(4762).getWeb());
	}
}
