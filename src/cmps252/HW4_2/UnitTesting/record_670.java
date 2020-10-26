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

@Tag("35")
class Record_670 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 670: FirstName is Carey")
	void FirstNameOfRecord670() {
		assertEquals("Carey", customers.get(669).getFirstName());
	}

	@Test
	@DisplayName("Record 670: LastName is Castellon")
	void LastNameOfRecord670() {
		assertEquals("Castellon", customers.get(669).getLastName());
	}

	@Test
	@DisplayName("Record 670: Company is Thorne, Jeffrey L Esq")
	void CompanyOfRecord670() {
		assertEquals("Thorne, Jeffrey L Esq", customers.get(669).getCompany());
	}

	@Test
	@DisplayName("Record 670: Address is 1500 20th St Sw")
	void AddressOfRecord670() {
		assertEquals("1500 20th St Sw", customers.get(669).getAddress());
	}

	@Test
	@DisplayName("Record 670: City is Cedar Rapids")
	void CityOfRecord670() {
		assertEquals("Cedar Rapids", customers.get(669).getCity());
	}

	@Test
	@DisplayName("Record 670: County is Linn")
	void CountyOfRecord670() {
		assertEquals("Linn", customers.get(669).getCounty());
	}

	@Test
	@DisplayName("Record 670: State is IA")
	void StateOfRecord670() {
		assertEquals("IA", customers.get(669).getState());
	}

	@Test
	@DisplayName("Record 670: ZIP is 52404")
	void ZIPOfRecord670() {
		assertEquals("52404", customers.get(669).getZIP());
	}

	@Test
	@DisplayName("Record 670: Phone is 319-362-8571")
	void PhoneOfRecord670() {
		assertEquals("319-362-8571", customers.get(669).getPhone());
	}

	@Test
	@DisplayName("Record 670: Fax is 319-362-0957")
	void FaxOfRecord670() {
		assertEquals("319-362-0957", customers.get(669).getFax());
	}

	@Test
	@DisplayName("Record 670: Email is carey@castellon.com")
	void EmailOfRecord670() {
		assertEquals("carey@castellon.com", customers.get(669).getEmail());
	}

	@Test
	@DisplayName("Record 670: Web is http://www.careycastellon.com")
	void WebOfRecord670() {
		assertEquals("http://www.careycastellon.com", customers.get(669).getWeb());
	}
}
