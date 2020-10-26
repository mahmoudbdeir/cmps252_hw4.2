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
class Record_1452 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1452: FirstName is Dominique")
	void FirstNameOfRecord1452() {
		assertEquals("Dominique", customers.get(1451).getFirstName());
	}

	@Test
	@DisplayName("Record 1452: LastName is Ogunyemi")
	void LastNameOfRecord1452() {
		assertEquals("Ogunyemi", customers.get(1451).getLastName());
	}

	@Test
	@DisplayName("Record 1452: Company is Abr Wholesalers Inc")
	void CompanyOfRecord1452() {
		assertEquals("Abr Wholesalers Inc", customers.get(1451).getCompany());
	}

	@Test
	@DisplayName("Record 1452: Address is 42 Main St")
	void AddressOfRecord1452() {
		assertEquals("42 Main St", customers.get(1451).getAddress());
	}

	@Test
	@DisplayName("Record 1452: City is Flemington")
	void CityOfRecord1452() {
		assertEquals("Flemington", customers.get(1451).getCity());
	}

	@Test
	@DisplayName("Record 1452: County is Hunterdon")
	void CountyOfRecord1452() {
		assertEquals("Hunterdon", customers.get(1451).getCounty());
	}

	@Test
	@DisplayName("Record 1452: State is NJ")
	void StateOfRecord1452() {
		assertEquals("NJ", customers.get(1451).getState());
	}

	@Test
	@DisplayName("Record 1452: ZIP is 8822")
	void ZIPOfRecord1452() {
		assertEquals("8822", customers.get(1451).getZIP());
	}

	@Test
	@DisplayName("Record 1452: Phone is 908-782-5972")
	void PhoneOfRecord1452() {
		assertEquals("908-782-5972", customers.get(1451).getPhone());
	}

	@Test
	@DisplayName("Record 1452: Fax is 908-782-8659")
	void FaxOfRecord1452() {
		assertEquals("908-782-8659", customers.get(1451).getFax());
	}

	@Test
	@DisplayName("Record 1452: Email is dominique@ogunyemi.com")
	void EmailOfRecord1452() {
		assertEquals("dominique@ogunyemi.com", customers.get(1451).getEmail());
	}

	@Test
	@DisplayName("Record 1452: Web is http://www.dominiqueogunyemi.com")
	void WebOfRecord1452() {
		assertEquals("http://www.dominiqueogunyemi.com", customers.get(1451).getWeb());
	}
}
