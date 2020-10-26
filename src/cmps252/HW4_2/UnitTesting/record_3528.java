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

@Tag("24")
class Record_3528 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3528: FirstName is Bridgette")
	void FirstNameOfRecord3528() {
		assertEquals("Bridgette", customers.get(3527).getFirstName());
	}

	@Test
	@DisplayName("Record 3528: LastName is Stuart")
	void LastNameOfRecord3528() {
		assertEquals("Stuart", customers.get(3527).getLastName());
	}

	@Test
	@DisplayName("Record 3528: Company is Wygh Of Life")
	void CompanyOfRecord3528() {
		assertEquals("Wygh Of Life", customers.get(3527).getCompany());
	}

	@Test
	@DisplayName("Record 3528: Address is 429 Wall Blvd  #-10")
	void AddressOfRecord3528() {
		assertEquals("429 Wall Blvd  #-10", customers.get(3527).getAddress());
	}

	@Test
	@DisplayName("Record 3528: City is Gretna")
	void CityOfRecord3528() {
		assertEquals("Gretna", customers.get(3527).getCity());
	}

	@Test
	@DisplayName("Record 3528: County is Jefferson")
	void CountyOfRecord3528() {
		assertEquals("Jefferson", customers.get(3527).getCounty());
	}

	@Test
	@DisplayName("Record 3528: State is LA")
	void StateOfRecord3528() {
		assertEquals("LA", customers.get(3527).getState());
	}

	@Test
	@DisplayName("Record 3528: ZIP is 70056")
	void ZIPOfRecord3528() {
		assertEquals("70056", customers.get(3527).getZIP());
	}

	@Test
	@DisplayName("Record 3528: Phone is 504-392-8776")
	void PhoneOfRecord3528() {
		assertEquals("504-392-8776", customers.get(3527).getPhone());
	}

	@Test
	@DisplayName("Record 3528: Fax is 504-392-3358")
	void FaxOfRecord3528() {
		assertEquals("504-392-3358", customers.get(3527).getFax());
	}

	@Test
	@DisplayName("Record 3528: Email is bridgette@stuart.com")
	void EmailOfRecord3528() {
		assertEquals("bridgette@stuart.com", customers.get(3527).getEmail());
	}

	@Test
	@DisplayName("Record 3528: Web is http://www.bridgettestuart.com")
	void WebOfRecord3528() {
		assertEquals("http://www.bridgettestuart.com", customers.get(3527).getWeb());
	}
}
