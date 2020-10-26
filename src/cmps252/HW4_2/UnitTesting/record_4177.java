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

@Tag("11")
class Record_4177 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4177: FirstName is Anderson")
	void FirstNameOfRecord4177() {
		assertEquals("Anderson", customers.get(4176).getFirstName());
	}

	@Test
	@DisplayName("Record 4177: LastName is Helferty")
	void LastNameOfRecord4177() {
		assertEquals("Helferty", customers.get(4176).getLastName());
	}

	@Test
	@DisplayName("Record 4177: Company is Barger, Charles G Esq")
	void CompanyOfRecord4177() {
		assertEquals("Barger, Charles G Esq", customers.get(4176).getCompany());
	}

	@Test
	@DisplayName("Record 4177: Address is 4301 W Beltline Hwy")
	void AddressOfRecord4177() {
		assertEquals("4301 W Beltline Hwy", customers.get(4176).getAddress());
	}

	@Test
	@DisplayName("Record 4177: City is Madison")
	void CityOfRecord4177() {
		assertEquals("Madison", customers.get(4176).getCity());
	}

	@Test
	@DisplayName("Record 4177: County is Dane")
	void CountyOfRecord4177() {
		assertEquals("Dane", customers.get(4176).getCounty());
	}

	@Test
	@DisplayName("Record 4177: State is WI")
	void StateOfRecord4177() {
		assertEquals("WI", customers.get(4176).getState());
	}

	@Test
	@DisplayName("Record 4177: ZIP is 53711")
	void ZIPOfRecord4177() {
		assertEquals("53711", customers.get(4176).getZIP());
	}

	@Test
	@DisplayName("Record 4177: Phone is 608-274-4929")
	void PhoneOfRecord4177() {
		assertEquals("608-274-4929", customers.get(4176).getPhone());
	}

	@Test
	@DisplayName("Record 4177: Fax is 608-274-9305")
	void FaxOfRecord4177() {
		assertEquals("608-274-9305", customers.get(4176).getFax());
	}

	@Test
	@DisplayName("Record 4177: Email is anderson@helferty.com")
	void EmailOfRecord4177() {
		assertEquals("anderson@helferty.com", customers.get(4176).getEmail());
	}

	@Test
	@DisplayName("Record 4177: Web is http://www.andersonhelferty.com")
	void WebOfRecord4177() {
		assertEquals("http://www.andersonhelferty.com", customers.get(4176).getWeb());
	}
}
