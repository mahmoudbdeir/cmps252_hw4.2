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
class Record_4706 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4706: FirstName is Benedict")
	void FirstNameOfRecord4706() {
		assertEquals("Benedict", customers.get(4705).getFirstName());
	}

	@Test
	@DisplayName("Record 4706: LastName is Ruise")
	void LastNameOfRecord4706() {
		assertEquals("Ruise", customers.get(4705).getLastName());
	}

	@Test
	@DisplayName("Record 4706: Company is Hnedak Bobo Group")
	void CompanyOfRecord4706() {
		assertEquals("Hnedak Bobo Group", customers.get(4705).getCompany());
	}

	@Test
	@DisplayName("Record 4706: Address is 4820 University Dr Nw  #-5")
	void AddressOfRecord4706() {
		assertEquals("4820 University Dr Nw  #-5", customers.get(4705).getAddress());
	}

	@Test
	@DisplayName("Record 4706: City is Huntsville")
	void CityOfRecord4706() {
		assertEquals("Huntsville", customers.get(4705).getCity());
	}

	@Test
	@DisplayName("Record 4706: County is Madison")
	void CountyOfRecord4706() {
		assertEquals("Madison", customers.get(4705).getCounty());
	}

	@Test
	@DisplayName("Record 4706: State is AL")
	void StateOfRecord4706() {
		assertEquals("AL", customers.get(4705).getState());
	}

	@Test
	@DisplayName("Record 4706: ZIP is 35816")
	void ZIPOfRecord4706() {
		assertEquals("35816", customers.get(4705).getZIP());
	}

	@Test
	@DisplayName("Record 4706: Phone is 256-895-3830")
	void PhoneOfRecord4706() {
		assertEquals("256-895-3830", customers.get(4705).getPhone());
	}

	@Test
	@DisplayName("Record 4706: Fax is 256-895-4368")
	void FaxOfRecord4706() {
		assertEquals("256-895-4368", customers.get(4705).getFax());
	}

	@Test
	@DisplayName("Record 4706: Email is benedict@ruise.com")
	void EmailOfRecord4706() {
		assertEquals("benedict@ruise.com", customers.get(4705).getEmail());
	}

	@Test
	@DisplayName("Record 4706: Web is http://www.benedictruise.com")
	void WebOfRecord4706() {
		assertEquals("http://www.benedictruise.com", customers.get(4705).getWeb());
	}
}
