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
class Record_1264 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1264: FirstName is Bernice")
	void FirstNameOfRecord1264() {
		assertEquals("Bernice", customers.get(1263).getFirstName());
	}

	@Test
	@DisplayName("Record 1264: LastName is Resto")
	void LastNameOfRecord1264() {
		assertEquals("Resto", customers.get(1263).getLastName());
	}

	@Test
	@DisplayName("Record 1264: Company is Howard County Lbry Ctrl Lbry")
	void CompanyOfRecord1264() {
		assertEquals("Howard County Lbry Ctrl Lbry", customers.get(1263).getCompany());
	}

	@Test
	@DisplayName("Record 1264: Address is 50 Knickerbocker Rd")
	void AddressOfRecord1264() {
		assertEquals("50 Knickerbocker Rd", customers.get(1263).getAddress());
	}

	@Test
	@DisplayName("Record 1264: City is Moonachie")
	void CityOfRecord1264() {
		assertEquals("Moonachie", customers.get(1263).getCity());
	}

	@Test
	@DisplayName("Record 1264: County is Bergen")
	void CountyOfRecord1264() {
		assertEquals("Bergen", customers.get(1263).getCounty());
	}

	@Test
	@DisplayName("Record 1264: State is NJ")
	void StateOfRecord1264() {
		assertEquals("NJ", customers.get(1263).getState());
	}

	@Test
	@DisplayName("Record 1264: ZIP is 7074")
	void ZIPOfRecord1264() {
		assertEquals("7074", customers.get(1263).getZIP());
	}

	@Test
	@DisplayName("Record 1264: Phone is 201-935-2515")
	void PhoneOfRecord1264() {
		assertEquals("201-935-2515", customers.get(1263).getPhone());
	}

	@Test
	@DisplayName("Record 1264: Fax is 201-935-4609")
	void FaxOfRecord1264() {
		assertEquals("201-935-4609", customers.get(1263).getFax());
	}

	@Test
	@DisplayName("Record 1264: Email is bernice@resto.com")
	void EmailOfRecord1264() {
		assertEquals("bernice@resto.com", customers.get(1263).getEmail());
	}

	@Test
	@DisplayName("Record 1264: Web is http://www.berniceresto.com")
	void WebOfRecord1264() {
		assertEquals("http://www.berniceresto.com", customers.get(1263).getWeb());
	}
}
