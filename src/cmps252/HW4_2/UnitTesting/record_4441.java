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
class Record_4441 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4441: FirstName is Samantha")
	void FirstNameOfRecord4441() {
		assertEquals("Samantha", customers.get(4440).getFirstName());
	}

	@Test
	@DisplayName("Record 4441: LastName is Ciborowski")
	void LastNameOfRecord4441() {
		assertEquals("Ciborowski", customers.get(4440).getLastName());
	}

	@Test
	@DisplayName("Record 4441: Company is Technology Marketing Corp")
	void CompanyOfRecord4441() {
		assertEquals("Technology Marketing Corp", customers.get(4440).getCompany());
	}

	@Test
	@DisplayName("Record 4441: Address is 205 W College St")
	void AddressOfRecord4441() {
		assertEquals("205 W College St", customers.get(4440).getAddress());
	}

	@Test
	@DisplayName("Record 4441: City is Lake Charles")
	void CityOfRecord4441() {
		assertEquals("Lake Charles", customers.get(4440).getCity());
	}

	@Test
	@DisplayName("Record 4441: County is Calcasieu")
	void CountyOfRecord4441() {
		assertEquals("Calcasieu", customers.get(4440).getCounty());
	}

	@Test
	@DisplayName("Record 4441: State is LA")
	void StateOfRecord4441() {
		assertEquals("LA", customers.get(4440).getState());
	}

	@Test
	@DisplayName("Record 4441: ZIP is 70605")
	void ZIPOfRecord4441() {
		assertEquals("70605", customers.get(4440).getZIP());
	}

	@Test
	@DisplayName("Record 4441: Phone is 337-478-5243")
	void PhoneOfRecord4441() {
		assertEquals("337-478-5243", customers.get(4440).getPhone());
	}

	@Test
	@DisplayName("Record 4441: Fax is 337-478-7494")
	void FaxOfRecord4441() {
		assertEquals("337-478-7494", customers.get(4440).getFax());
	}

	@Test
	@DisplayName("Record 4441: Email is samantha@ciborowski.com")
	void EmailOfRecord4441() {
		assertEquals("samantha@ciborowski.com", customers.get(4440).getEmail());
	}

	@Test
	@DisplayName("Record 4441: Web is http://www.samanthaciborowski.com")
	void WebOfRecord4441() {
		assertEquals("http://www.samanthaciborowski.com", customers.get(4440).getWeb());
	}
}
