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
class Record_1295 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1295: FirstName is Elton")
	void FirstNameOfRecord1295() {
		assertEquals("Elton", customers.get(1294).getFirstName());
	}

	@Test
	@DisplayName("Record 1295: LastName is Ciani")
	void LastNameOfRecord1295() {
		assertEquals("Ciani", customers.get(1294).getLastName());
	}

	@Test
	@DisplayName("Record 1295: Company is Lavelle, William J Esq")
	void CompanyOfRecord1295() {
		assertEquals("Lavelle, William J Esq", customers.get(1294).getCompany());
	}

	@Test
	@DisplayName("Record 1295: Address is 3040 E Olympic Blvd")
	void AddressOfRecord1295() {
		assertEquals("3040 E Olympic Blvd", customers.get(1294).getAddress());
	}

	@Test
	@DisplayName("Record 1295: City is Los Angeles")
	void CityOfRecord1295() {
		assertEquals("Los Angeles", customers.get(1294).getCity());
	}

	@Test
	@DisplayName("Record 1295: County is Los Angeles")
	void CountyOfRecord1295() {
		assertEquals("Los Angeles", customers.get(1294).getCounty());
	}

	@Test
	@DisplayName("Record 1295: State is CA")
	void StateOfRecord1295() {
		assertEquals("CA", customers.get(1294).getState());
	}

	@Test
	@DisplayName("Record 1295: ZIP is 90023")
	void ZIPOfRecord1295() {
		assertEquals("90023", customers.get(1294).getZIP());
	}

	@Test
	@DisplayName("Record 1295: Phone is 323-264-8583")
	void PhoneOfRecord1295() {
		assertEquals("323-264-8583", customers.get(1294).getPhone());
	}

	@Test
	@DisplayName("Record 1295: Fax is 323-264-0523")
	void FaxOfRecord1295() {
		assertEquals("323-264-0523", customers.get(1294).getFax());
	}

	@Test
	@DisplayName("Record 1295: Email is elton@ciani.com")
	void EmailOfRecord1295() {
		assertEquals("elton@ciani.com", customers.get(1294).getEmail());
	}

	@Test
	@DisplayName("Record 1295: Web is http://www.eltonciani.com")
	void WebOfRecord1295() {
		assertEquals("http://www.eltonciani.com", customers.get(1294).getWeb());
	}
}
