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

@Tag("12")
class Record_4599 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4599: FirstName is Ruth")
	void FirstNameOfRecord4599() {
		assertEquals("Ruth", customers.get(4598).getFirstName());
	}

	@Test
	@DisplayName("Record 4599: LastName is Poux")
	void LastNameOfRecord4599() {
		assertEquals("Poux", customers.get(4598).getLastName());
	}

	@Test
	@DisplayName("Record 4599: Company is Saul The Zaents Film Center")
	void CompanyOfRecord4599() {
		assertEquals("Saul The Zaents Film Center", customers.get(4598).getCompany());
	}

	@Test
	@DisplayName("Record 4599: Address is 4428 Secor Rd")
	void AddressOfRecord4599() {
		assertEquals("4428 Secor Rd", customers.get(4598).getAddress());
	}

	@Test
	@DisplayName("Record 4599: City is Toledo")
	void CityOfRecord4599() {
		assertEquals("Toledo", customers.get(4598).getCity());
	}

	@Test
	@DisplayName("Record 4599: County is Lucas")
	void CountyOfRecord4599() {
		assertEquals("Lucas", customers.get(4598).getCounty());
	}

	@Test
	@DisplayName("Record 4599: State is OH")
	void StateOfRecord4599() {
		assertEquals("OH", customers.get(4598).getState());
	}

	@Test
	@DisplayName("Record 4599: ZIP is 43623")
	void ZIPOfRecord4599() {
		assertEquals("43623", customers.get(4598).getZIP());
	}

	@Test
	@DisplayName("Record 4599: Phone is 419-475-1567")
	void PhoneOfRecord4599() {
		assertEquals("419-475-1567", customers.get(4598).getPhone());
	}

	@Test
	@DisplayName("Record 4599: Fax is 419-475-1529")
	void FaxOfRecord4599() {
		assertEquals("419-475-1529", customers.get(4598).getFax());
	}

	@Test
	@DisplayName("Record 4599: Email is ruth@poux.com")
	void EmailOfRecord4599() {
		assertEquals("ruth@poux.com", customers.get(4598).getEmail());
	}

	@Test
	@DisplayName("Record 4599: Web is http://www.ruthpoux.com")
	void WebOfRecord4599() {
		assertEquals("http://www.ruthpoux.com", customers.get(4598).getWeb());
	}
}
