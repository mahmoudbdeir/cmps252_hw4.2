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
class Record_3209 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3209: FirstName is Karin")
	void FirstNameOfRecord3209() {
		assertEquals("Karin", customers.get(3208).getFirstName());
	}

	@Test
	@DisplayName("Record 3209: LastName is Sheldrick")
	void LastNameOfRecord3209() {
		assertEquals("Sheldrick", customers.get(3208).getLastName());
	}

	@Test
	@DisplayName("Record 3209: Company is Janacek, Douglas J Esq")
	void CompanyOfRecord3209() {
		assertEquals("Janacek, Douglas J Esq", customers.get(3208).getCompany());
	}

	@Test
	@DisplayName("Record 3209: Address is 420 S 96th St  #-25")
	void AddressOfRecord3209() {
		assertEquals("420 S 96th St  #-25", customers.get(3208).getAddress());
	}

	@Test
	@DisplayName("Record 3209: City is Seattle")
	void CityOfRecord3209() {
		assertEquals("Seattle", customers.get(3208).getCity());
	}

	@Test
	@DisplayName("Record 3209: County is King")
	void CountyOfRecord3209() {
		assertEquals("King", customers.get(3208).getCounty());
	}

	@Test
	@DisplayName("Record 3209: State is WA")
	void StateOfRecord3209() {
		assertEquals("WA", customers.get(3208).getState());
	}

	@Test
	@DisplayName("Record 3209: ZIP is 98108")
	void ZIPOfRecord3209() {
		assertEquals("98108", customers.get(3208).getZIP());
	}

	@Test
	@DisplayName("Record 3209: Phone is 206-763-6316")
	void PhoneOfRecord3209() {
		assertEquals("206-763-6316", customers.get(3208).getPhone());
	}

	@Test
	@DisplayName("Record 3209: Fax is 206-763-7981")
	void FaxOfRecord3209() {
		assertEquals("206-763-7981", customers.get(3208).getFax());
	}

	@Test
	@DisplayName("Record 3209: Email is karin@sheldrick.com")
	void EmailOfRecord3209() {
		assertEquals("karin@sheldrick.com", customers.get(3208).getEmail());
	}

	@Test
	@DisplayName("Record 3209: Web is http://www.karinsheldrick.com")
	void WebOfRecord3209() {
		assertEquals("http://www.karinsheldrick.com", customers.get(3208).getWeb());
	}
}
