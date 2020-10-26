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
class Record_4108 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4108: FirstName is Rosario")
	void FirstNameOfRecord4108() {
		assertEquals("Rosario", customers.get(4107).getFirstName());
	}

	@Test
	@DisplayName("Record 4108: LastName is Bigness")
	void LastNameOfRecord4108() {
		assertEquals("Bigness", customers.get(4107).getLastName());
	}

	@Test
	@DisplayName("Record 4108: Company is Gray, Jeffrey B Esq")
	void CompanyOfRecord4108() {
		assertEquals("Gray, Jeffrey B Esq", customers.get(4107).getCompany());
	}

	@Test
	@DisplayName("Record 4108: Address is 6200 S Sayre Ave")
	void AddressOfRecord4108() {
		assertEquals("6200 S Sayre Ave", customers.get(4107).getAddress());
	}

	@Test
	@DisplayName("Record 4108: City is Chicago")
	void CityOfRecord4108() {
		assertEquals("Chicago", customers.get(4107).getCity());
	}

	@Test
	@DisplayName("Record 4108: County is Cook")
	void CountyOfRecord4108() {
		assertEquals("Cook", customers.get(4107).getCounty());
	}

	@Test
	@DisplayName("Record 4108: State is IL")
	void StateOfRecord4108() {
		assertEquals("IL", customers.get(4107).getState());
	}

	@Test
	@DisplayName("Record 4108: ZIP is 60638")
	void ZIPOfRecord4108() {
		assertEquals("60638", customers.get(4107).getZIP());
	}

	@Test
	@DisplayName("Record 4108: Phone is 773-586-4745")
	void PhoneOfRecord4108() {
		assertEquals("773-586-4745", customers.get(4107).getPhone());
	}

	@Test
	@DisplayName("Record 4108: Fax is 773-586-3351")
	void FaxOfRecord4108() {
		assertEquals("773-586-3351", customers.get(4107).getFax());
	}

	@Test
	@DisplayName("Record 4108: Email is rosario@bigness.com")
	void EmailOfRecord4108() {
		assertEquals("rosario@bigness.com", customers.get(4107).getEmail());
	}

	@Test
	@DisplayName("Record 4108: Web is http://www.rosariobigness.com")
	void WebOfRecord4108() {
		assertEquals("http://www.rosariobigness.com", customers.get(4107).getWeb());
	}
}
