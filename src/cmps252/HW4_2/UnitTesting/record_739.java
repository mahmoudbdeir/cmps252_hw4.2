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

@Tag("7")
class Record_739 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 739: FirstName is Tyron")
	void FirstNameOfRecord739() {
		assertEquals("Tyron", customers.get(738).getFirstName());
	}

	@Test
	@DisplayName("Record 739: LastName is Dacus")
	void LastNameOfRecord739() {
		assertEquals("Dacus", customers.get(738).getLastName());
	}

	@Test
	@DisplayName("Record 739: Company is Ramada Htl & Cnfrnc Ctr Bucks")
	void CompanyOfRecord739() {
		assertEquals("Ramada Htl & Cnfrnc Ctr Bucks", customers.get(738).getCompany());
	}

	@Test
	@DisplayName("Record 739: Address is 5669 S Withlapopka Dr")
	void AddressOfRecord739() {
		assertEquals("5669 S Withlapopka Dr", customers.get(738).getAddress());
	}

	@Test
	@DisplayName("Record 739: City is Floral City")
	void CityOfRecord739() {
		assertEquals("Floral City", customers.get(738).getCity());
	}

	@Test
	@DisplayName("Record 739: County is Citrus")
	void CountyOfRecord739() {
		assertEquals("Citrus", customers.get(738).getCounty());
	}

	@Test
	@DisplayName("Record 739: State is FL")
	void StateOfRecord739() {
		assertEquals("FL", customers.get(738).getState());
	}

	@Test
	@DisplayName("Record 739: ZIP is 34436")
	void ZIPOfRecord739() {
		assertEquals("34436", customers.get(738).getZIP());
	}

	@Test
	@DisplayName("Record 739: Phone is 352-726-1846")
	void PhoneOfRecord739() {
		assertEquals("352-726-1846", customers.get(738).getPhone());
	}

	@Test
	@DisplayName("Record 739: Fax is 352-726-9767")
	void FaxOfRecord739() {
		assertEquals("352-726-9767", customers.get(738).getFax());
	}

	@Test
	@DisplayName("Record 739: Email is tyron@dacus.com")
	void EmailOfRecord739() {
		assertEquals("tyron@dacus.com", customers.get(738).getEmail());
	}

	@Test
	@DisplayName("Record 739: Web is http://www.tyrondacus.com")
	void WebOfRecord739() {
		assertEquals("http://www.tyrondacus.com", customers.get(738).getWeb());
	}
}
