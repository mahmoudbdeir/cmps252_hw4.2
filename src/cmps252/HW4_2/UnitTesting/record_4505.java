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

@Tag("37")
class Record_4505 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4505: FirstName is Scott")
	void FirstNameOfRecord4505() {
		assertEquals("Scott", customers.get(4504).getFirstName());
	}

	@Test
	@DisplayName("Record 4505: LastName is Furtado")
	void LastNameOfRecord4505() {
		assertEquals("Furtado", customers.get(4504).getLastName());
	}

	@Test
	@DisplayName("Record 4505: Company is Amercn Assn Schl Prsnnl")
	void CompanyOfRecord4505() {
		assertEquals("Amercn Assn Schl Prsnnl", customers.get(4504).getCompany());
	}

	@Test
	@DisplayName("Record 4505: Address is 305 N 3rd St  #-220")
	void AddressOfRecord4505() {
		assertEquals("305 N 3rd St  #-220", customers.get(4504).getAddress());
	}

	@Test
	@DisplayName("Record 4505: City is Burlington")
	void CityOfRecord4505() {
		assertEquals("Burlington", customers.get(4504).getCity());
	}

	@Test
	@DisplayName("Record 4505: County is Des Moines")
	void CountyOfRecord4505() {
		assertEquals("Des Moines", customers.get(4504).getCounty());
	}

	@Test
	@DisplayName("Record 4505: State is IA")
	void StateOfRecord4505() {
		assertEquals("IA", customers.get(4504).getState());
	}

	@Test
	@DisplayName("Record 4505: ZIP is 52601")
	void ZIPOfRecord4505() {
		assertEquals("52601", customers.get(4504).getZIP());
	}

	@Test
	@DisplayName("Record 4505: Phone is 319-752-9057")
	void PhoneOfRecord4505() {
		assertEquals("319-752-9057", customers.get(4504).getPhone());
	}

	@Test
	@DisplayName("Record 4505: Fax is 319-752-0366")
	void FaxOfRecord4505() {
		assertEquals("319-752-0366", customers.get(4504).getFax());
	}

	@Test
	@DisplayName("Record 4505: Email is scott@furtado.com")
	void EmailOfRecord4505() {
		assertEquals("scott@furtado.com", customers.get(4504).getEmail());
	}

	@Test
	@DisplayName("Record 4505: Web is http://www.scottfurtado.com")
	void WebOfRecord4505() {
		assertEquals("http://www.scottfurtado.com", customers.get(4504).getWeb());
	}
}
