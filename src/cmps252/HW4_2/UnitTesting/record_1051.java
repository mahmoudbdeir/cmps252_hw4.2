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

@Tag("2")
class Record_1051 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1051: FirstName is Shayla")
	void FirstNameOfRecord1051() {
		assertEquals("Shayla", customers.get(1050).getFirstName());
	}

	@Test
	@DisplayName("Record 1051: LastName is Hackl")
	void LastNameOfRecord1051() {
		assertEquals("Hackl", customers.get(1050).getLastName());
	}

	@Test
	@DisplayName("Record 1051: Company is Creative Leasing Concepts")
	void CompanyOfRecord1051() {
		assertEquals("Creative Leasing Concepts", customers.get(1050).getCompany());
	}

	@Test
	@DisplayName("Record 1051: Address is 2040 W Spring Creek Pky  #-14")
	void AddressOfRecord1051() {
		assertEquals("2040 W Spring Creek Pky  #-14", customers.get(1050).getAddress());
	}

	@Test
	@DisplayName("Record 1051: City is Plano")
	void CityOfRecord1051() {
		assertEquals("Plano", customers.get(1050).getCity());
	}

	@Test
	@DisplayName("Record 1051: County is Collin")
	void CountyOfRecord1051() {
		assertEquals("Collin", customers.get(1050).getCounty());
	}

	@Test
	@DisplayName("Record 1051: State is TX")
	void StateOfRecord1051() {
		assertEquals("TX", customers.get(1050).getState());
	}

	@Test
	@DisplayName("Record 1051: ZIP is 75023")
	void ZIPOfRecord1051() {
		assertEquals("75023", customers.get(1050).getZIP());
	}

	@Test
	@DisplayName("Record 1051: Phone is 972-527-8358")
	void PhoneOfRecord1051() {
		assertEquals("972-527-8358", customers.get(1050).getPhone());
	}

	@Test
	@DisplayName("Record 1051: Fax is 972-527-0739")
	void FaxOfRecord1051() {
		assertEquals("972-527-0739", customers.get(1050).getFax());
	}

	@Test
	@DisplayName("Record 1051: Email is shayla@hackl.com")
	void EmailOfRecord1051() {
		assertEquals("shayla@hackl.com", customers.get(1050).getEmail());
	}

	@Test
	@DisplayName("Record 1051: Web is http://www.shaylahackl.com")
	void WebOfRecord1051() {
		assertEquals("http://www.shaylahackl.com", customers.get(1050).getWeb());
	}
}
