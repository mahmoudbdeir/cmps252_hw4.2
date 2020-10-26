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

@Tag("9")
class Record_4404 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4404: FirstName is Rhoda")
	void FirstNameOfRecord4404() {
		assertEquals("Rhoda", customers.get(4403).getFirstName());
	}

	@Test
	@DisplayName("Record 4404: LastName is Buri")
	void LastNameOfRecord4404() {
		assertEquals("Buri", customers.get(4403).getLastName());
	}

	@Test
	@DisplayName("Record 4404: Company is Clints Cabinet Shop")
	void CompanyOfRecord4404() {
		assertEquals("Clints Cabinet Shop", customers.get(4403).getCompany());
	}

	@Test
	@DisplayName("Record 4404: Address is 909 Ne Loop  #-410")
	void AddressOfRecord4404() {
		assertEquals("909 Ne Loop  #-410", customers.get(4403).getAddress());
	}

	@Test
	@DisplayName("Record 4404: City is San Antonio")
	void CityOfRecord4404() {
		assertEquals("San Antonio", customers.get(4403).getCity());
	}

	@Test
	@DisplayName("Record 4404: County is Bexar")
	void CountyOfRecord4404() {
		assertEquals("Bexar", customers.get(4403).getCounty());
	}

	@Test
	@DisplayName("Record 4404: State is TX")
	void StateOfRecord4404() {
		assertEquals("TX", customers.get(4403).getState());
	}

	@Test
	@DisplayName("Record 4404: ZIP is 78209")
	void ZIPOfRecord4404() {
		assertEquals("78209", customers.get(4403).getZIP());
	}

	@Test
	@DisplayName("Record 4404: Phone is 210-828-3842")
	void PhoneOfRecord4404() {
		assertEquals("210-828-3842", customers.get(4403).getPhone());
	}

	@Test
	@DisplayName("Record 4404: Fax is 210-828-3351")
	void FaxOfRecord4404() {
		assertEquals("210-828-3351", customers.get(4403).getFax());
	}

	@Test
	@DisplayName("Record 4404: Email is rhoda@buri.com")
	void EmailOfRecord4404() {
		assertEquals("rhoda@buri.com", customers.get(4403).getEmail());
	}

	@Test
	@DisplayName("Record 4404: Web is http://www.rhodaburi.com")
	void WebOfRecord4404() {
		assertEquals("http://www.rhodaburi.com", customers.get(4403).getWeb());
	}
}
