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

@Tag("13")
class Record_722 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 722: FirstName is yleen")
	void FirstNameOfRecord722() {
		assertEquals("yleen", customers.get(721).getFirstName());
	}

	@Test
	@DisplayName("Record 722: LastName is Bourgois")
	void LastNameOfRecord722() {
		assertEquals("Bourgois", customers.get(721).getLastName());
	}

	@Test
	@DisplayName("Record 722: Company is Carroll, Frederick Iii")
	void CompanyOfRecord722() {
		assertEquals("Carroll, Frederick Iii", customers.get(721).getCompany());
	}

	@Test
	@DisplayName("Record 722: Address is 3030 S 11th St")
	void AddressOfRecord722() {
		assertEquals("3030 S 11th St", customers.get(721).getAddress());
	}

	@Test
	@DisplayName("Record 722: City is Niles")
	void CityOfRecord722() {
		assertEquals("Niles", customers.get(721).getCity());
	}

	@Test
	@DisplayName("Record 722: County is Berrien")
	void CountyOfRecord722() {
		assertEquals("Berrien", customers.get(721).getCounty());
	}

	@Test
	@DisplayName("Record 722: State is MI")
	void StateOfRecord722() {
		assertEquals("MI", customers.get(721).getState());
	}

	@Test
	@DisplayName("Record 722: ZIP is 49120")
	void ZIPOfRecord722() {
		assertEquals("49120", customers.get(721).getZIP());
	}

	@Test
	@DisplayName("Record 722: Phone is 269-683-7654")
	void PhoneOfRecord722() {
		assertEquals("269-683-7654", customers.get(721).getPhone());
	}

	@Test
	@DisplayName("Record 722: Fax is 269-683-6471")
	void FaxOfRecord722() {
		assertEquals("269-683-6471", customers.get(721).getFax());
	}

	@Test
	@DisplayName("Record 722: Email is yleen@bourgois.com")
	void EmailOfRecord722() {
		assertEquals("yleen@bourgois.com", customers.get(721).getEmail());
	}

	@Test
	@DisplayName("Record 722: Web is http://www.yleenbourgois.com")
	void WebOfRecord722() {
		assertEquals("http://www.yleenbourgois.com", customers.get(721).getWeb());
	}
}
