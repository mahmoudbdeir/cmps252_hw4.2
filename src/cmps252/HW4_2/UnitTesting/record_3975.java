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

@Tag("47")
class Record_3975 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3975: FirstName is Jodi")
	void FirstNameOfRecord3975() {
		assertEquals("Jodi", customers.get(3974).getFirstName());
	}

	@Test
	@DisplayName("Record 3975: LastName is Dundas")
	void LastNameOfRecord3975() {
		assertEquals("Dundas", customers.get(3974).getLastName());
	}

	@Test
	@DisplayName("Record 3975: Company is Norman Williams & Assocs Inc")
	void CompanyOfRecord3975() {
		assertEquals("Norman Williams & Assocs Inc", customers.get(3974).getCompany());
	}

	@Test
	@DisplayName("Record 3975: Address is 4 Gateway Ctr")
	void AddressOfRecord3975() {
		assertEquals("4 Gateway Ctr", customers.get(3974).getAddress());
	}

	@Test
	@DisplayName("Record 3975: City is Pittsburgh")
	void CityOfRecord3975() {
		assertEquals("Pittsburgh", customers.get(3974).getCity());
	}

	@Test
	@DisplayName("Record 3975: County is Allegheny")
	void CountyOfRecord3975() {
		assertEquals("Allegheny", customers.get(3974).getCounty());
	}

	@Test
	@DisplayName("Record 3975: State is PA")
	void StateOfRecord3975() {
		assertEquals("PA", customers.get(3974).getState());
	}

	@Test
	@DisplayName("Record 3975: ZIP is 15222")
	void ZIPOfRecord3975() {
		assertEquals("15222", customers.get(3974).getZIP());
	}

	@Test
	@DisplayName("Record 3975: Phone is 412-765-9577")
	void PhoneOfRecord3975() {
		assertEquals("412-765-9577", customers.get(3974).getPhone());
	}

	@Test
	@DisplayName("Record 3975: Fax is 412-765-8533")
	void FaxOfRecord3975() {
		assertEquals("412-765-8533", customers.get(3974).getFax());
	}

	@Test
	@DisplayName("Record 3975: Email is jodi@dundas.com")
	void EmailOfRecord3975() {
		assertEquals("jodi@dundas.com", customers.get(3974).getEmail());
	}

	@Test
	@DisplayName("Record 3975: Web is http://www.jodidundas.com")
	void WebOfRecord3975() {
		assertEquals("http://www.jodidundas.com", customers.get(3974).getWeb());
	}
}
