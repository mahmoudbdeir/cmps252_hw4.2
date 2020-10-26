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

@Tag("16")
class Record_4345 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4345: FirstName is King")
	void FirstNameOfRecord4345() {
		assertEquals("King", customers.get(4344).getFirstName());
	}

	@Test
	@DisplayName("Record 4345: LastName is Finnell")
	void LastNameOfRecord4345() {
		assertEquals("Finnell", customers.get(4344).getLastName());
	}

	@Test
	@DisplayName("Record 4345: Company is Agency Software")
	void CompanyOfRecord4345() {
		assertEquals("Agency Software", customers.get(4344).getCompany());
	}

	@Test
	@DisplayName("Record 4345: Address is 7711 Carondelet Ave")
	void AddressOfRecord4345() {
		assertEquals("7711 Carondelet Ave", customers.get(4344).getAddress());
	}

	@Test
	@DisplayName("Record 4345: City is Saint Louis")
	void CityOfRecord4345() {
		assertEquals("Saint Louis", customers.get(4344).getCity());
	}

	@Test
	@DisplayName("Record 4345: County is Saint Louis")
	void CountyOfRecord4345() {
		assertEquals("Saint Louis", customers.get(4344).getCounty());
	}

	@Test
	@DisplayName("Record 4345: State is MO")
	void StateOfRecord4345() {
		assertEquals("MO", customers.get(4344).getState());
	}

	@Test
	@DisplayName("Record 4345: ZIP is 63105")
	void ZIPOfRecord4345() {
		assertEquals("63105", customers.get(4344).getZIP());
	}

	@Test
	@DisplayName("Record 4345: Phone is 314-725-8799")
	void PhoneOfRecord4345() {
		assertEquals("314-725-8799", customers.get(4344).getPhone());
	}

	@Test
	@DisplayName("Record 4345: Fax is 314-725-9358")
	void FaxOfRecord4345() {
		assertEquals("314-725-9358", customers.get(4344).getFax());
	}

	@Test
	@DisplayName("Record 4345: Email is king@finnell.com")
	void EmailOfRecord4345() {
		assertEquals("king@finnell.com", customers.get(4344).getEmail());
	}

	@Test
	@DisplayName("Record 4345: Web is http://www.kingfinnell.com")
	void WebOfRecord4345() {
		assertEquals("http://www.kingfinnell.com", customers.get(4344).getWeb());
	}
}
